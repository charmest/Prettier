package as.test.thomasstodonte;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {

	private static final long serialVersionUID = 1L;
	private Integer iUserIdA;
	private String something;
	private String otherThing;
	public static final String CODE_BIDON = "CODE_BIDON";

	/** Type PDF */
	public static final String TYPE_PDF = "PDF";
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmmss");

	/**
	 * Enregistrement temporaire du pdf dans la table
	 *
	 * @param rootAppli
	 * @throws Exception* @throws JRException
	 * @throws SQLException
	 */
	public String enregistreFichierPdf(String rootAppli) throws Exception, JRException, SQLException {
		String path = rootAppli + "Un chemin - Documentation - test.pdf";
		byte[] bytePdf = this.pdfToByte(path);
		return "Bonjour";
	}
}
