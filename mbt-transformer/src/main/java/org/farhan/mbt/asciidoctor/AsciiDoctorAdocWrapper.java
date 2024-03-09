package org.farhan.mbt.asciidoctor;

import java.io.File;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private File theFile;
	private Document theDoc;

	public AsciiDoctorAdocWrapper(File theFile) {
		setFile(theFile);
		theDoc = Factory.create().load("= " + theFile.getName(), Options.builder().build());
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() {
		if (theFile.exists()) {
			theDoc = Factory.create().loadFile(theFile, Options.builder().build());
		}
	}

	@Override
	public void save() throws Exception {
		String fileContents = docToString();
		Utilities.writeFile(theFile, fileContents);
	}

	private String docToString() {
		String text = "";
		text += ":tags: " + theDoc.getAttribute("tags") + "\n";
		text += "= " + theDoc.getTitle() + "\n";
		text += "\n";
		text += ((Block) theDoc.getBlocks().getFirst()).getSource() + "\n";
		for (int i = 1; i < theDoc.getBlocks().size(); i++) {
			Section section = (Section) theDoc.getBlocks().get(i);
			text += "\n";
			text += "[tags=\"" + section.getAttribute("tags") + "\"]" + "\n";
			text += "== " + section.getTitle() + "\n";
			for (StructuralNode ssn : section.getBlocks()) {
				if (ssn instanceof Block) {
					Block b = (Block) ssn;
					text += "\n";
					text += b.getSource() + "\n";
				} else if (ssn instanceof List) {
					List l = (List) ssn;
					text += "\n";
					for (StructuralNode lsn : l.getItems()) {
						ListItem li = (ListItem) lsn;
						text += "* " + li.getText() + "\n";
						for (StructuralNode lisn : li.getBlocks()) {
							Table t = (Table) lisn;
							text += "\n";
							text += "[options=\"header\"]\n";
							text += "|===\n";
							// TODO get header, then loop through body
							text += "|===\n";
							text += "\n";
						}
					}
				}
			}
		}
		return text;
	}

	@Override
	public Object get() {
		return theDoc;
	}

}
