package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 10, Color.BLACK);
		DrawingModel model = new DrawingModel();
		
		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		addPointCmd.execute();
		
		System.out.println(model.getShapes());
		
		// ------ Testiranje Remove komande
		RemovePointCmd removePointCmd = new RemovePointCmd(model, p1);
		removePointCmd.execute();
		
		System.out.println(model.getShapes());
		
		removePointCmd.unexecute();
		System.out.println(model.getShapes());

	}

}
