package com.example;

import java.util.List;

public class PDFGenerator {
	public static void main(String[] args) {
		List<String> messages = null;
		System.out.println();

		/* while (true) { */
		/*
		 * System.out.println("Waiting for a message in the queue"); messages =
		 * RedisConnector.RPOP("reports-summary");
		 * System.out.println("Got the message");
		 * 
		 * String payload = messages.get(1);
		 * 
		 * JSONParserEngine json = new JSONParserEngine(payload); HTMLRenderer
		 * render = new HTMLRenderer(json.readIndividualReport());
		 */

		
		
		  /*System.out.println("Converting...");
		  
		  String command = "wkhtmltopdf /home/tristan/workspace/napa-gr8pi-reportgen-java/gr8pi-reportgen/reportgen-next/tmp/main.html  /home/tristan/workspace/napa-gr8pi-reportgen-java/gr8pi-reportgen/reportgen-next/tmp/test-results/sumary-report.pdf";
		  StringBuffer output = new StringBuffer(); 
		  Process p; 
		  try { 
			  p =Runtime.getRuntime().exec(command); 
		  } catch (Exception e) {
			  e.printStackTrace(); 
		  } 
		  System.out.println(output);
		  
		  System.out.println("---Done---");*/
		 
		  
		  System.out.println("Converting...");
		  
		  String command = "/home/tristan/Downloads/wkhtmltox/bin/wkhtmltopdf -T 0 -B 0 -L 0 -R 0 --viewport-size 2500 /home/tristan/workspace/napa-gr8pi-reportgen-java/gr8pi-reportgen/reportgen-next/tmp/main.html  /home/tristan/workspace/napa-gr8pi-reportgen-java/gr8pi-reportgen/reportgen-next/tmp/test-results/sumary-report.pdf";
		  StringBuffer output = new StringBuffer(); 
		  Process p; 
		  try { 
			  p =Runtime.getRuntime().exec(command); 
		  } catch (Exception e) {
			  e.printStackTrace(); 
		  } 
		  System.out.println(output);
		  
		  System.out.println("---Done---");		
		
		
		/*try {
			System.out.println("Converting...");
			PDFreactor pdfReactor = new PDFreactor();

			// configuration settings 
			Configuration config = new Configuration();
			config.setAddLinks(true);
			config.setAddBookmarks(true);

			// the input document //
			//config.setDocument("http://huecodo.com/main.html");

			String htmlData = FileUtils.readFileToString(
					new File(System.getProperty("user.dir")
							+ "/src/main/resource/summary-report.html"),
					"utf-8");

			String licenseKey = "<license><licensee><name>vutrieu1082@gmail.com</name>  </licensee>  <product>PDFreactor</product>" +
  "<majorversion>8</majorversion>  <minorversion>0</minorversion>  <licensetype>Evaluation</licensetype>  <expirationdate>2016-08-04</expirationdate> " +
  "<signatureinformation>    <signdate>2016-07-04 04:33</signdate>    <signature>302c02140b7db4fd5103fa14004dfb07e39709ae13bca94502145715f59dd4e568b6bf412a79e28775806391ed37</signature> " +
    " <checksum>1396</checksum>  </signatureinformation></license>";
			config.setLicenseKey(licenseKey);
			config.setDocument(htmlData);

			// render the PDF document 
			Result result = pdfReactor.convert(config);
			byte[] pdf = result.getDocument();

			FileOutputStream outputStream = new FileOutputStream(
					"/home/tristan/workspace/napa-gr8pi-reportgen-java/gr8pi-reportgen/reportgen-next/src/main/resource/pdfreactor-summary-report.pdf");

			outputStream.write(pdf);
			outputStream.close();
			System.out.println("---------- Convert done -----------");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
	}
	
}
