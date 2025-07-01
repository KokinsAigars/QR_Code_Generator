
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateSimpleQR {
    public static void main(String[] args) throws WriterException, IOException {

        //  URL
        String data = "https://github.com/KokinsAigars/QR_Code_Generator";

        //  SAVE LOCATION
        String path = "X:\\Desktop\\QR_Code.png";

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 1500, 1500);

        MatrixToImageWriter.writeToPath(matrix, "png", Paths.get(path));

        System.out.println("QRCode generated");

    }
}
