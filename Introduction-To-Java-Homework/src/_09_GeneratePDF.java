import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class _09_GeneratePDF {

	public static void main(String[] args) {
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream("CardDeck.pdf"));
	
			document.open();
			
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
			table.getDefaultCell().setFixedHeight(180);
			
			BaseFont baseFont = BaseFont.createFont("lib/FreeSerif.ttf", BaseFont.IDENTITY_H, true);
			Font black = new Font(baseFont, 70f, Font.NORMAL, BaseColor.BLACK);
			Font red = new Font(baseFont, 70f, Font.NORMAL, BaseColor.RED);
			
			String card = "";
			char color = ' ';
			
			for (int i = 2; i < 15; i++) {
				for (int j = 0; j < 4; j++) {
					switch (i) {
					case 10: card = "10"; break;
					case 11: card = " J"; break;
					case 12: card = " Q"; break;
					case 13: card = " K"; break;
					case 14: card = " A"; break;
					default: card = " " + i; break;
					}
					switch (j) {
					case 0:	color = '\u2663';table.addCell(new Paragraph(card + color + " ", black)); break;
					case 1:	color = '\u2666';table.addCell(new Paragraph(card + color + " ", red)); break;
					case 2:	color = '\u2665';table.addCell(new Paragraph(card + color + " ", red)); break;
					case 3:	color = '\u2660';table.addCell(new Paragraph(card + color + " ", black)); break;
					default:System.out.println("Error"); break;
					}
				}
				
			}
			
			document.add(table);
			//document.add(new Paragraph("A Hello World Pdf document."));
			document.close();
		} catch (DocumentException e){
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
