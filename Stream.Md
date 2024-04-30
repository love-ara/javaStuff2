1. java.io: byteBase stream and character stream

ByteBase stream: input and output
-InputStream:is an abstract class of the byte-based stream with subclasses like FileInputStream, DataInputStream, objectInputStream e.t.c.

-OutputStream: is the abstract class at the root of the hierarchy of the byte-based output stream with subclasses directly related to it: FileOutputStream, DataOutputStream, ObjectOutputStream e.t.c.

Character based Stream:
-Reader: on the root of the input hierarchy is an abstract class with subclasses: FileReader, InputStreamReader, BufferedReader, StringReader, e.t.c.
-Writer: on the root of the output hierarchy is an abstract class with subclasses: FileWriter, OutputStreamReader, BufferedWriter, StringWriter, e.t.c.
