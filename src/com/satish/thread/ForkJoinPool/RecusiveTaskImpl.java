package com.satish.thread.ForkJoinPool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecusiveTaskImpl extends RecursiveTask<List<String>> {

	String filePath ;
	RecusiveTaskImpl(String path)
	{
		this.filePath = path;
	}
	@Override
	protected List<String> compute() {
		
		//System.out.println("task");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list = new ArrayList<String>();
		List<RecusiveTaskImpl> listOfSubTasks = new ArrayList<RecusiveTaskImpl>();
		
		File file = new File(filePath);
		File[] files = file.listFiles();
		
		if(files!=null)
		{
			for(File fileTemp : files)
			{
				if(fileTemp.isDirectory())
				{
					RecusiveTaskImpl rti  = new RecusiveTaskImpl(fileTemp.getAbsolutePath());
					rti.fork();
					listOfSubTasks.add(rti);
				}else
				{
					//System.out.println(fileTemp.getAbsolutePath());
					list.add(fileTemp.getAbsolutePath());
				}
			}
		}
		addResultsToTask(listOfSubTasks,list);
		return list;
	}
	
	private void addResultsToTask(List<RecusiveTaskImpl> tasks,List<String> list)
	{
		for(RecusiveTaskImpl rti : tasks)
		{
			List<String> listResult = rti.join();
			list.addAll(listResult);
			
		}
	}

}
