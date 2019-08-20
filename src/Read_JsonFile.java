import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Read_JsonFile {
	static String str = "";

	public static void main(String[] args) throws IOException, NullPointerException {
		JSONParser parser = new JSONParser();
		try {

			Object obj = parser
					.parse(new FileReader("C:\\Users\\pravinutala\\Desktop\\old data\\Pradeep\\temp\\jsonFile.txt"));
			JSONObject jsonObject = (JSONObject) obj;

			Map resp = ((Map) jsonObject.get("response"));
			Iterator<Map.Entry> itr1 = resp.entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				if (pair.getKey().equals("preRegistrationIds")) {
					String preReg = pair.getValue().toString();
					JSONObject preRegObject = (JSONObject) parser.parse(preReg);
					Map preRegMap = ((HashMap) preRegObject);
					// System.out.println(preRegMap.keySet());

					Set strKeys = (preRegMap.keySet());
					for (Object key : strKeys) {
						// System.out.println(key.toString().replaceAll(" ", "").trim());
						str = str + key + ",";
					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(str);
		FileWriter fw = new FileWriter(
				new File("C:\\Users\\pravinutala\\Desktop\\old data\\Pradeep\\temp\\jsonFile_write.txt"));
		BufferedWriter bw=new BufferedWriter(fw);

		bw.write(str);
		bw.close();
	}
}