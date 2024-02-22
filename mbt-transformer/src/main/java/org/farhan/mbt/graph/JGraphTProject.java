package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class JGraphTProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;

	public JGraphTProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "target/Graphs/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save();
		}
	}

	@Override
	public String getFileExt(String layer) {
		return ".graph";
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerFiles = null;
		switch (layer) {
		case FIRST_LAYER:
			layerFiles = firstLayerObjects;
			break;
		}
		return layerFiles;
	}

	@Override
	public ConvertibleObject createObject(String name) {
		JGraphTGraphWrapper gtf = new JGraphTGraphWrapper(new File(name));
		firstLayerObjects.add(gtf);
		return gtf;
	}

}
