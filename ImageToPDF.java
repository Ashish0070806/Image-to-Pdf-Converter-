import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.AreaBreak;

import javax.swing.*;
import java.io.File;

public class ImageToPDF {
    public static void main(String[] args) {
        try {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setMultiSelectionEnabled(true);

            int option = fileChooser.showOpenDialog(null);

            if (option != JFileChooser.APPROVE_OPTION) {
                System.out.println("No file selected!");
                return;
            }

            File[] selectedFiles = fileChooser.getSelectedFiles();

            PdfWriter writer = new PdfWriter("output.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            Document doc = new Document(pdf);

            for (int i = 0; i < selectedFiles.length; i++) {

                File file = selectedFiles[i];
                String name = file.getName().toLowerCase();

                if (name.endsWith(".jpg") || name.endsWith(".png")) {

                    Image img = new Image(ImageDataFactory.create(file.getAbsolutePath()));
                    img.setAutoScale(true);
                    doc.add(img);

                    if (i < selectedFiles.length - 1) {
                        doc.add(new AreaBreak());
                    }
                }
            }

            doc.close();

            JOptionPane.showMessageDialog(null, "✅ PDF Created Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}