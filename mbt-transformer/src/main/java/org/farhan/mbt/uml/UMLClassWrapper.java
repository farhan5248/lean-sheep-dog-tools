package org.farhan.mbt.uml;

import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.ConvertibleObject;

public class UMLClassWrapper implements ConvertibleObject {

	private Class theClass;
	private File theFile;

	public UMLClassWrapper(UMLProject umlProject, Class theClass) {
		this.theClass = theClass;
		theFile = umlProject.getDir("");
	}

	public void addBackground(Interaction background) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files
	}

	public void addScenario(Interaction scenario) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files
	}

	public void addScenarioOutline(Interaction scenarioOutline) {
		// TODO maybe this isn't needed, review why it's needed for adoc and graph files

	}

	private EAnnotation createAnnotation(Class className, String name, String key) {
		EAnnotation a = className.getEAnnotation(name);
		if (a == null) {
			a = className.createEAnnotation(name);
		}
		if (!key.isEmpty()) {
			a.getDetails().put(key, "");
		}
		return a;
	}

	private EAnnotation createAnnotation(Interaction anInteraction, String name) {
		EAnnotation a = anInteraction.getEAnnotation(name);
		if (a == null) {
			a = anInteraction.createEAnnotation(name);
		}
		return a;
	}

	protected EAnnotation createAnnotation(Interaction anInteraction, String name, String key, String value) {
		EAnnotation a = createAnnotation(anInteraction, name);
		a.getDetails().put(key, value);
		return a;
	}

	private EAnnotation createAnnotation(Message aMessage, String name, String key, String value) {
		EAnnotation a = aMessage.getEAnnotation(name);
		if (a == null) {
			a = aMessage.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	private EAnnotation createAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = vs.getEAnnotation(name);
		if (a == null) {
			a = vs.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	private ValueSpecification createArgument(Message aMessage, String name, String value) {
		LiteralString ls = (LiteralString) aMessage.getArgument(name, null);
		if (ls == null) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) aMessage.createArgument(name, null, ls.eClass());
			ls.setName(name);
			ls.setValue(value);
		}
		return ls;
	}

	public Interaction createBackground(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
		createAnnotation(scenario, "background");
		return scenario;
	}

	public void createDocString(Message step, String content) {
		ValueSpecification vs = createArgument(step, "docString", "");
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			createAnnotation(vs, "docString", String.valueOf(i), lines[i]);
		}
	}

	public EAnnotation createExamples(Interaction scenarioOutline, String name) {
		return createAnnotation(scenarioOutline, name);
	}

	public void createExamplesRow(EAnnotation examples, ArrayList<String> examplesRow) {
		String value = "";
		for (String e : examplesRow) {
			value += e + "|";
		}
		examples.getDetails().put(String.valueOf(examples.getDetails().size()), value);

	}

	public void createExamplesTable(EAnnotation examples, ArrayList<String> headers) {
		String value = "";
		for (String e : headers) {
			value += e + "|";
		}
		examples.getDetails().put("0", value);
	}

	private Interaction createInteraction(Class theClass, String interactionName, String annotationName) {
		Interaction anInteraction = (Interaction) theClass.getOwnedBehavior(interactionName);
		if (anInteraction == null) {
			anInteraction = UMLFactory.eINSTANCE.createInteraction();
			anInteraction.setName(interactionName);
			theClass.setClassifierBehavior(anInteraction);
		}
		if (!annotationName.isEmpty()) {
			createAnnotation(anInteraction, annotationName);
		}
		return anInteraction;
	}

	public Interaction createScenario(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
		return scenario;
	}

	public Interaction createScenarioOutline(String name) {
		Interaction scenario = createInteraction(theClass, name, "");
		return scenario;
	}

	public Message createStep(Interaction abstractScenario, String stepName) {
		String keyword = stepName.split(" ")[0];
		Message step = abstractScenario.createMessage(stepName.substring(keyword.length() + 1));
		createAnnotation(step, "Step", "Keyword", keyword);
		return step;
	}

	public void createStepTable(Message step, ArrayList<ArrayList<String>> stepTableRowList) {
		ValueSpecification table = createArgument(step, "dataTable", "");
		// header
		String row = "";
		for (int i = 0; i < stepTableRowList.get(0).size(); i++) {
			row += stepTableRowList.get(0).get(i) + " |";
		}
		createAnnotation(table, "dataTable", String.valueOf(0), row);
		// body
		for (int i = 1; i < stepTableRowList.size(); i++) {
			row = "";
			ArrayList<String> bodyRow = stepTableRowList.get(i);
			for (int j = 0; j < bodyRow.size(); j++) {
				row += stepTableRowList.get(i).get(j) + " |";
			}
			createAnnotation(table, "dataTable", String.valueOf(i), row);
		}
	}

	@Override
	public Object get() {
		return theClass;
	}

	public ArrayList<Interaction> getAbstractScenarioList() {
		ArrayList<Interaction> abstractScenarioList = new ArrayList<Interaction>();
		for (Behavior b : theClass.getOwnedBehaviors()) {
			abstractScenarioList.add((Interaction) b);
		}
		return abstractScenarioList;
	}

	public String getBackgroundDescription(Interaction abstractScenario) {
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getBackgroundName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public String getDocString(Message step) {
		ValueSpecification vs = (LiteralString) step.getArgument("docString", null);
		EMap<String, String> docString = vs.getEAnnotation("docString").getDetails();
		String content = "";
		for (int i = 0; i < docString.keySet().size(); i++) {
			content += "\n" + docString.get(i).getValue();
		}
		content = content.replaceFirst("\n", "");
		return content;
	}

	public ArrayList<EAnnotation> getExamplesList(Interaction abstractScenario) {
		ArrayList<EAnnotation> exampleList = new ArrayList<EAnnotation>();
		for (EAnnotation a : abstractScenario.getEAnnotations()) {
			if (!a.getSource().contentEquals("tags")) {
				exampleList.add(a);
			}
		}
		return exampleList;
	}

	public String getExamplesName(EAnnotation examples) {
		return examples.getSource();
	}

	public ArrayList<ArrayList<String>> getExamplesRowList(EAnnotation examples) {
		// TODO this should just be a list of lists. Having the header for each row
		// doesn't help. If the headers are needed to convert rows, pass the parent
		// table
		// Also there should be a getRow call to go with this
		ArrayList<ArrayList<String>> examplesRowList = new ArrayList<ArrayList<String>>();
		int rowCnt = examples.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = examples.getDetails().get(i).getValue().split("\\|");
			ArrayList<String> cellList = new ArrayList<String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				cellList.add(row[j]);
			}
			examplesRowList.add(cellList);
		}
		return examplesRowList;
	}

	public ArrayList<String> getExamplesTable(EAnnotation examples) {
		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : examples.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		return paramNames;
	}

	public String getFeatureDescription() {
		if (theClass.getOwnedComments().size() > 0) {
			return theClass.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getFeatureName() {
		return theClass.getEAnnotations().getFirst().getDetails().get(0).getKey();
	}

	public String getFeatureTags() {
		String tags = "";
		if (theClass.getEAnnotations().size() == 2) {
			for (Entry<String, String> t : theClass.getEAnnotations().getLast().getDetails()) {
				if (tags.isEmpty()) {
					tags = t.getKey();
				} else {
					tags += "," + t.getKey();
				}
			}
		}
		return tags;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getQualifiedName() {
		// TODO make sure all wrappers have this instead of the getFile approach to
		// getting the name. When returning a file name, remove the C:// whatever
		return theClass.getQualifiedName();
	}

	public String getScenarioDescription(Interaction abstractScenario) {
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getScenarioName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineDescription(Interaction abstractScenario) {
		if (abstractScenario.getOwnedComments().size() > 0) {
			return abstractScenario.getOwnedComments().get(0).getBody();
		}
		return "";
	}

	public String getScenarioOutlineName(Interaction abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getScenarioTags(Interaction abstractScenario) {
		return getTags(abstractScenario);
	}

	public String getStep(Message step) {
		String name = step.getName();
		String keyword = step.getEAnnotation("Step").getDetails().get("Keyword");
		return keyword + " " + name;
	}

	public ArrayList<Message> getStepList(Interaction abstractScenario) {
		ArrayList<Message> stepList = new ArrayList<Message>();
		for (Message m : abstractScenario.getMessages()) {
			stepList.add(m);
		}
		return stepList;
	}

	public String getStepName(Message step) {
		return step.getName();
	}

	public ArrayList<ArrayList<String>> getStepTable(Message stepSrc) {
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		ValueSpecification vs = (LiteralString) stepSrc.getArgument("dataTable", null);
		for (Entry<String, String> r : vs.getEAnnotation("dataTable").getDetails()) {
			row = new ArrayList<String>();
			for (String cell : r.getValue().split(" \\|")) {
				row.add(cell);
			}
			table.add(row);
		}
		return table;
	}

	private String getTags(Interaction abstractScenario) {
		String tags = "";
		if (abstractScenario.getEAnnotation("tags") != null) {
			for (Entry<String, String> t : abstractScenario.getEAnnotation("tags").getDetails()) {
				tags += "," + t.getKey();
			}
		}
		return tags.replaceFirst(",", "");
	}

	public boolean hasDocString(Message step) {
		return step.getArgument("docString", null) != null;
	}

	public boolean hasStepTable(Message step) {
		return step.getArgument("dataTable", null) != null;
	}

	public boolean isBackground(Interaction abstractScenario) {
		return abstractScenario.getEAnnotation("background") != null;
	}

	public boolean isScenarioOutline(Interaction abstractScenario) {
		// if there's an annotation not called tags or background
		for (EAnnotation a : abstractScenario.getEAnnotations()) {
			if (!a.getSource().contentEquals("tags") && !a.getSource().contentEquals("background")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void load() throws Exception {
		// TODO does nothing for now until there is a uml file for each class
	}

	@Override
	public void save() throws Exception {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

	public void setBackgroundDescription(Interaction background, String backgroundDescription) {
		background.createOwnedComment().setBody(backgroundDescription);
	}

	public void setFeatureDescription(String featureDescription) {
		theClass.createOwnedComment().setBody(featureDescription);

	}

	public void setFeatureName(String featureName) {
		createAnnotation(theClass, "title", featureName);
	}

	public void setFeatureTags(String featureTags) {
		// TODO this if statement is not needed if a list is passed in rather than a
		// string
		if (!featureTags.isEmpty()) {
			for (String t : featureTags.split(",")) {
				createAnnotation(theClass, "tags", t);
			}
		}
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	public void setScenarioDescription(Interaction scenario, String scenarioDescription) {
		scenario.createOwnedComment().setBody(scenarioDescription);
	}

	public void setScenarioOutlineDescription(Interaction scenarioOutline, String scenarioOutlineDescription) {
		scenarioOutline.createOwnedComment().setBody(scenarioOutlineDescription);
	}

	public void setScenarioOutlineTags(Interaction abstractScenario, String tags) {
		setTags(abstractScenario, tags);
	}

	public void setScenarioTags(Interaction abstractScenario, String tags) {
		setTags(abstractScenario, tags);
	}

	private void setTags(Interaction abstractScenario, String tags) {
		// TODO this if statement is not needed if a list is passed in rather than a
		// string
		if (!tags.isEmpty()) {
			for (String t : tags.split(",")) {
				createAnnotation(abstractScenario, "tags", t);
			}
		}
	}

}
