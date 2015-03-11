import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
///
import org.apache.avro.generic.GenericEnumSymbol;


public class GenericMain {
        public static void main(String[] args) throws IOException {
/*              Schema schema = new Parser().parse(new File("/home/saurabhsawant/dev/avro/doc/examples/user.avsc"));
                
                ///GenericRecord user1 = new GenericData.Record(schema);
                ///user1.put("name", "Alyssa");
                //user1.put("favorite_number", 256);
                // Leave favorite color null
                
                ///GenericRecord user2 = new GenericData.Record(schema);
                ///user2.put("name", "Ben");
                //user2.put("favorite_number", 7);
                ///user2.put("favorite_color", "red");

                GenericEnumSymbol enumSymbol = new GenericData.EnumSymbol(schema, "S3"); /// schema is the example enum schema
                GenericEnumSymbol enumSymbol1 = new GenericData.EnumSymbol(schema, "S3"); /// schema is the example enum schema 
                // Serialize user1 and user2 to disk
                File file = new File("users.avro");
                DatumWriter<GenericEnumSymbol> datumWriter = new GenericDatumWriter<GenericEnumSymbol>(schema);
                DataFileWriter<GenericEnumSymbol> dataFileWriter = new DataFileWriter<GenericEnumSymbol>(datumWriter);
                dataFileWriter.create(schema, file);
                ///dataFileWriter.append(user1);
                ///dataFileWriter.append(user2);
                dataFileWriter.append(enumSymbol);///
                dataFileWriter.append(enumSymbol1);///
                dataFileWriter.close();
                
                // Deserialize users from disk
                DatumReader<GenericEnumSymbol> datumReader = new GenericDatumReader<GenericEnumSymbol>(schema);
                DataFileReader<GenericEnumSymbol> dataFileReader = new DataFileReader<GenericEnumSymbol>(file, datumReader);
                ///GenericRecord user = null;
                GenericEnumSymbol user = null;
                while (dataFileReader.hasNext()) {
                        // Reuse user object by passing it to next(). This saves us from
                        // allocating and garbage collecting many objects for files with
                        // many items.
                        user = dataFileReader.next(user);
                        System.out.println(user);
                }
*/
        }
