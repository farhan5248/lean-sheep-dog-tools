package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;
import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private JRubyProcessor jrp;
	private Document theDoc;
	private File theFile;

	public AsciiDoctorAdocWrapper(File theFile) {
		setFile(theFile);
		theDoc = Factory.create().load("= " + theFile.getName(), Options.builder().build());
		jrp = new JRubyProcessor();
	}

	public void addBackground(Section background) {
		theDoc.getBlocks().add(background);
	}

	public void addScenario(Section scenario) {
		theDoc.getBlocks().add(scenario);
	}

	public void addScenarioOutline(Section scenarioOutline) {
		theDoc.getBlocks().add(scenarioOutline);
	}

	public Section createBackground(String name) {
		Section background = jrp.createSection(theDoc);
		background.getAttributes().put("background", "true");
		background.setTitle(name);
		return background;
	}

	public void createDocString(Section step, String content) {
		Block docString = jrp.createBlock(step, "listing", "");
		step.getBlocks().add(docString);
		docString.setSource(content);
	}

	public Section createExamples(Section scenarioOutline, String examplesName) {
		Section examples = jrp.createSection(scenarioOutline);
		examples.getAttributes().put("examples", "true");
		examples.setTitle(examplesName);
		scenarioOutline.getBlocks().add(examples);
		return examples;
	}

	public void createExamplesRow(Section examples, ArrayList<String> examplesRow) {
		Table table = null;
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				table = (Table) block;
				break;
			}
		}
		Row row = jrp.createTableRow(table);
		table.getBody().add(row);
		int colCnt = 0;
		for (String e : examplesRow) {
			Cell cell = jrp.createTableCell(table.getColumns().get(colCnt), e);
			row.getCells().add(cell);
			colCnt++;
		}
	}

	public void createExamplesTable(Section examples, ArrayList<String> headers) {
		Table table = jrp.createTable(examples);
		examples.getBlocks().add(table);
		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		int colCnt = 0;
		for (String e : headers) {
			Column column = jrp.createTableColumn(table, colCnt);
			table.getColumns().add(column);
			Cell cell = jrp.createTableCell(column, e.replaceFirst("[0-9]+ ", ""));
			row.getCells().add(cell);
			colCnt++;
		}
	}

	public Section createScenario(String scenarioName) {
		Section scenario = jrp.createSection(theDoc);
		scenario.setTitle(scenarioName);
		return scenario;
	}

	public Section createScenarioOutline(String scenarioName) {
		Section scenario = jrp.createSection(theDoc);
		scenario.setTitle(scenarioName);
		return scenario;
	}

	public Section createStep(Section abstractScenario, String stepName) {
		Section step = jrp.createSection(abstractScenario);
		step.setTitle(stepName);
		abstractScenario.getBlocks().add(step);
		return step;
	}

	public void createStepTable(Section step, ArrayList<ArrayList<String>> stepTableRowList) {
		Table table = jrp.createTable(step);
		step.getBlocks().add(table);

		// header
		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		for (int i = 0; i < stepTableRowList.getFirst().size(); i++) {
			Column column = jrp.createTableColumn(table, i);
			table.getColumns().add(column);
			Cell cell = jrp.createTableCell(column, stepTableRowList.get(0).get(i));
			row.getCells().add(cell);
		}
		// body
		for (int i = 1; i < stepTableRowList.size(); i++) {
			ArrayList<String> bodyRow = stepTableRowList.get(i);
			row = jrp.createTableRow(table);
			table.getBody().add(row);
			for (int j = 0; j < bodyRow.size(); j++) {
				Column column = table.getColumns().get(j);
				Cell cell = jrp.createTableCell(column, bodyRow.get(j));
				row.getCells().add(cell);
			}
		}
	}

	private String docToString() {
		String text = "";
		if (theDoc.getAttribute("tags") != null) {
			text += ":tags: " + theDoc.getAttribute("tags") + "\n";
		}
		text += "= " + theDoc.getTitle() + "\n";
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Block) {
				// feature description
				Block b = (Block) sn;
				if (!b.getSource().isEmpty()) {
					text += "\n";
					text += b.getSource() + "\n";
				}
			} else if (sn instanceof Section) {
				// scenario
				Section section = (Section) sn;
				text += "\n";
				if (section.getAttributes().size() > 0) {
					text += "[";
					if (section.getAttribute("tags") != null) {
						text += "tags=\"" + section.getAttribute("tags") + "\",";
					}
					if (section.getAttribute("background") != null) {
						text += "background=\"" + section.getAttribute("background") + "\",";
					}
					text = text.replaceAll(",$", "");
					text += "]\n";
				}
				text += "== " + section.getTitle() + "\n";
				for (StructuralNode ssn : section.getBlocks()) {
					if (ssn instanceof Block) {
						// scenario description
						Block b = (Block) ssn;
						if (!b.getSource().isEmpty()) {
							text += "\n";
							text += b.getSource() + "\n";
						}
					} else if (ssn instanceof Section) {
						// scenario step or examples
						Section step = (Section) ssn;
						text += "\n";
						if (step.getAttributes().size() > 0) {
							text += "[";
							if (step.getAttribute("tags") != null) {
								text += "tags=\"" + step.getAttribute("tags") + "\",";
							}
							if (step.getAttribute("examples") != null) {
								text += "examples=\"" + step.getAttribute("examples") + "\",";
							}
							text = text.replaceAll(",$", "");
							text += "]\n";
						}
						text += "=== " + step.getTitle() + "\n";
						for (StructuralNode tsn : step.getBlocks()) {
							if (tsn instanceof Table) {
								// step data table or examples data table
								Table t = (Table) tsn;
								text += "\n";
								text += "[options=\"header\"]\n";
								text += "|===\n";
								for (Cell c : t.getHeader().getFirst().getCells()) {
									text += "| " + c.getText();
								}
								text += "\n";
								for (Row r : t.getBody()) {
									for (Cell c : r.getCells()) {
										text += "| " + c.getText();
									}
									text += "\n";
								}
								text += "|===\n";
							} else if (tsn instanceof Block) {
								Block b = (Block) tsn;
								if (b.getContext().contentEquals("listing")) {
									// docstring
									text += "\n";
									text += "----\n";
									text += b.getSource() + "\n";
									text += "----\n";
								}
							}
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

	public String getAbstractScenarioDescription(StructuralNode testCaseOrTestSuite) {
		String text = "";
		for (StructuralNode sn : testCaseOrTestSuite.getBlocks()) {
			if (sn instanceof Block) {
				text += "\n\n" + ((Block) sn).getSource();
			} else {
				break;
			}
		}
		text = text.trim();
		return text;
	}

	public ArrayList<Section> getAbstractScenarioList() {
		ArrayList<Section> testCases = new ArrayList<Section>();
		for (StructuralNode sn : theDoc.getBlocks()) {
			if (sn instanceof Section) {
				testCases.add((Section) sn);
			}
		}
		return testCases;
	}

	public String getAbstractScenarioName(Section abstractScenario) {
		return abstractScenario.getTitle();
	}

	public String getAbstractScenarioTags(StructuralNode testCaseOrTestSuite) {
		String tags = (String) testCaseOrTestSuite.getAttributes().get("tags");
		if (tags == null) {
			return "";
		} else {
			return tags;
		}
	}

	public String getBackgroundDescription(Section background) {
		return getAbstractScenarioDescription(background);
	}

	public String getBackgroundName(Section background) {
		return getAbstractScenarioName(background);
	}

	public String getDocString(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Block) {
				if (sn.getContext().contentEquals("listing")) {
					Block block = (Block) sn;
					return block.getSource();
				}
			}
		}
		return null;
	}

	public ArrayList<Section> getExamplesList(Section testCase) {
		ArrayList<Section> examples = new ArrayList<Section>();
		for (StructuralNode sn : testCase.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") != null) {
					examples.add((Section) sn);
				}
			}
		}
		return examples;
	}

	public String getExamplesName(Section example) {
		return example.getTitle();
	}

	public ArrayList<ArrayList<String>> getExamplesRowList(Section examples) {
		ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				ArrayList<String> cellList;
				for (Row row : table.getBody()) {
					cellList = new ArrayList<String>();
					for (Cell cell : row.getCells()) {
						cellList.add(cell.getText());
					}
					rows.add(cellList);
				}
			}
		}
		return rows;
	}

	public ArrayList<String> getExamplesTable(Section examples) {
		ArrayList<String> header = new ArrayList<String>();
		for (StructuralNode block : examples.getBlocks()) {
			if (block instanceof Table) {
				Table table = (Table) block;
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					header.add(cell.getText());
				}
			}
		}
		return header;
	}

	public String getFeatureDescription() {
		for (StructuralNode block : theDoc.getBlocks()) {
			if (!(block instanceof Section)) {
				return getAbstractScenarioDescription(block);
			}
		}
		return "";
	}

	public String getFeatureName() {
		return theDoc.getTitle();
	}

	public String getFeatureTags() {
		return getAbstractScenarioTags(theDoc);
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getScenarioDescription(Section scenario) {
		return getAbstractScenarioDescription(scenario);
	}

	public String getScenarioName(Section scenario) {
		return getAbstractScenarioName(scenario);
	}

	public String getScenarioOutlineDescription(Section testCase) {
		return getAbstractScenarioDescription(testCase);
	}

	public String getScenarioOutlineName(Section scenarioOutline) {
		return getAbstractScenarioName(scenarioOutline);
	}

	public String getScenarioOutlineTags(Section abstractScenario) {
		return getAbstractScenarioTags(abstractScenario);
	}

	public String getScenarioTags(Section scenario) {
		return getAbstractScenarioTags(scenario);
	}

	public String getStep(Section step) {
		return step.getTitle();
	}

	public ArrayList<Section> getStepList(Section testCase) {
		ArrayList<Section> testSteps = new ArrayList<Section>();
		for (StructuralNode sn : testCase.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") == null) {
					testSteps.add((Section) sn);
				}
			}
		}
		return testSteps;
	}

	public ArrayList<ArrayList<String>> getStepTable(Section step) {
		ArrayList<ArrayList<String>> stepTableRowList = new ArrayList<ArrayList<String>>();
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				Table table = (Table) sn;
				ArrayList<String> cellList = new ArrayList<String>();
				stepTableRowList.add(cellList);
				for (Cell cell : table.getHeader().getFirst().getCells()) {
					cellList.add(cell.getText());
				}
				for (int i = 0; i < table.getBody().size(); i++) {
					cellList = new ArrayList<String>();
					stepTableRowList.add(cellList);
					for (Cell cell : table.getBody().get(i).getCells()) {
						cellList.add(cell.getText());
					}
				}
				return stepTableRowList;
			}
		}
		return stepTableRowList;
	}

	public boolean hasDocString(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Block) {
				if (sn.getContext().contentEquals("listing")) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasStepTable(Section step) {
		for (StructuralNode sn : step.getBlocks()) {
			if (sn instanceof Table) {
				return true;
			}
		}
		return false;
	}

	public boolean isBackground(Section abstractScenario) {
		return abstractScenario.getAttributes().get("background") != null;
	}

	public boolean isScenarioOutline(Section abstractScenario) {
		for (StructuralNode sn : abstractScenario.getBlocks()) {
			if (sn instanceof Section) {
				if (sn.getAttributes().get("examples") != null) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void load() throws Exception {
		try {
			if (theFile.exists()) {
				theDoc = Factory.create().loadFile(theFile, Options.builder().build());
			}
		} catch (Exception e) {
			throw new Exception("There was a problem loading file: " + theFile.getAbsolutePath());
		}
	}

	@Override
	public void save() throws Exception {
		String fileContents = docToString();
		Utilities.writeFile(theFile, fileContents);
	}

	public void setBackgroundDescription(Section background, String backgroundDescription) {
		background.getBlocks().add(jrp.createBlock(background, "paragraph", backgroundDescription));
	}

	public void setBackgroundName(Section background, String name) {
		background.setTitle(name);
	}

	public void setExamplesName(Section examples, String examplesName) {
		examples.setTitle(examplesName);
	}

	public void setFeatureDescription(String featureDescription) {
		Block block = jrp.createBlock(theDoc, "paragraph", featureDescription);
		theDoc.getBlocks().add(block);
	}

	public void setFeatureName(String featureName) {
		theDoc.setTitle(featureName);
	}

	public void setFeatureTags(String featureTags) {
		if (!featureTags.isEmpty()) {
			theDoc.getAttributes().put("tags", featureTags);
		}
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	public void setScenarioDescription(Section scenario, String scenarioDescription) {
		scenario.getBlocks().add(jrp.createBlock(scenario, "paragraph", scenarioDescription));
	}

	public void setScenarioName(Section scenario, String scenarioName) {
		scenario.setTitle(scenarioName);
	}

	public void setScenarioOutlineDescription(Section scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.getBlocks().add(jrp.createBlock(scenarioOutline, "paragraph", scenarioOutlineDescription));
	}

	public void setScenarioOutlineName(Section scenarioOutline, String scenarioOutlineName) {
		scenarioOutline.setTitle(scenarioOutlineName);
	}

	public void setScenarioOutlineTags(Section scenarioOutline, String scenarioOutlineTags) {
		if (!scenarioOutlineTags.isEmpty()) {
			scenarioOutline.getAttributes().put("tags", scenarioOutlineTags);
		}
	}

	public void setScenarioTags(Section scenario, String scenarioTags) {
		if (!scenarioTags.isEmpty()) {
			scenario.getAttributes().put("tags", scenarioTags);
		}
	}

}
