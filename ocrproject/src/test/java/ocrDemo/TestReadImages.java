package ocrDemo;

import java.io.File;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestReadImages {
	
	@Test
	public void testReadImages() {
		System.out.println("character recognition");
	

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ITesseract image=new Tesseract();

		try {

			String str=image.doOCR(new File("C:\\Users\\yaminii\\Desktop\\yamfile\\th2.png"));
			System.out.println("Data from image is \n" +str);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception "+e.getMessage());
		}


//	}
	
	}
	

}




