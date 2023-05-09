package ua.ithillel.iodemo;

import ua.ithillel.iodemo.adapter.EuropeInfoService;
import ua.ithillel.iodemo.adapter.InfoService;
import ua.ithillel.iodemo.adapter.Information;
import ua.ithillel.iodemo.adapter.USAInfoServiceAdapter;
import ua.ithillel.iodemo.decorator.DefaultNotifier;
import ua.ithillel.iodemo.decorator.Notifier;
import ua.ithillel.iodemo.decorator.SMSNotifier;
import ua.ithillel.iodemo.ext.USAService;
import ua.ithillel.iodemo.logger.FileLogger;
import ua.ithillel.iodemo.logger.FileLoggerConfig;
import ua.ithillel.iodemo.logger.FileLoggerConfigLoader;
import ua.ithillel.iodemo.logger.FileMaxSizeException;
import ua.ithillel.iodemo.model.Person;
import ua.ithillel.iodemo.server.MyBlockingServer;
import ua.ithillel.iodemo.server.MyNonBlockingServer;
import ua.ithillel.iodemo.weather.client.OpenWeatherClient;
import ua.ithillel.iodemo.weather.client.WeatherClient;
import ua.ithillel.iodemo.weather.model.WeatherInfo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.http.HttpClient;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Application {
    private static Notifier notifier;
    private static InfoService infoService;

    public static void main(String[] args) {

        //  FIXME: "Non-blocking server based on channels"
        try (MyNonBlockingServer myNonBlockingServer = new MyNonBlockingServer(8090)) {
            myNonBlockingServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //  FIXME: uncomment below to use "Channel and Buffer example"
//        Path path = Paths.get("file.txt");
//        try (FileChannel readChannel = FileChannel.open(path, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(20);
//            ByteBuffer writeBuffer = ByteBuffer.allocate(20);
//
//            writeBuffer.put("Hello World!".getBytes());
//            writeBuffer.flip();
//
//            readChannel.write(writeBuffer);

//            int read;
//            String result = "";
//           while ((read = readChannel.read(readBuffer)) != -1) {
//               readBuffer.flip();
//
//               Charset utf8 = StandardCharsets.UTF_8;
//               CharBuffer decode = utf8.decode(readBuffer);
//
//
//               char[] chars = decode.array();
//               result += new String(chars);
//
//               readBuffer.clear();
//           }

//            System.out.println(result);

//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //  FIXME: uncomment below to use "JSON deserializing example"
//        WeatherClient weatherClient = new OpenWeatherClient(HttpClient.newHttpClient());
//        WeatherInfo kyiv = weatherClient.getWeatherByCity("Kyiv");
//        WeatherInfo odessa = weatherClient.getWeatherByCity("Odessa");
//        WeatherInfo dnipro = weatherClient.getWeatherByCity("Dnipro");



        // FIXME: uncomment below to use "Java default serialization example"
//        Person johnDoe = new Person("John Doe", 32, "rfdrf");
//        Person ivanPetrenko = new Person("Ivan Petrenko", 28, "srfewrfr");
//
//        try (FileOutputStream fileOutputStream = new FileOutputStream("john.obj");
//             ObjectOutputStream objOut = new ObjectOutputStream(fileOutputStream);
//
//                ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("john.obj")))
//        ) {
//
//            Person johnFromFile = (Person) objIn.readObject();
//            System.out.println(johnFromFile);

//            objOut.writeObject(johnDoe);
//            objOut.flush();

//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        //  FIXME: uncomment below to use "Blocking server example"
//        try (MyBlockingServer myBlockingServer = new MyBlockingServer(8080)) {
//
//            myBlockingServer.start();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }



        //  FIXME: uncomment below to use "Home task explanation"
//        System.out.printf("[%s][%s]-%s", LocalDateTime.now(), "INFO", "user logged in");
//
//        FileLoggerConfig config = new FileLoggerConfigLoader()
//                .load("logger-config.txt");
//
//        FileLogger fileLogger = new FileLogger(config);
//        fileLogger.debug("user logged in");
//
//        fileLogger.info("Info event");



        // FIXME: uncomment below to use "IO Example
//        try {
//
//            BufferedReader rd = new BufferedReader(new FileReader("file.txt"));
//            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
//
//            String text = "";
//
//            text = rd.readLine();
//
//            w.println("Hello this is a line");
//            w.println("antoher one");
//
//            rd.close();
//
//            System.out.println(text);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // - --- --- ---
        // - rw- r-- r--
        // - r-- r-- r--
        // - 100 100 100 = 444


        //  FIXME: uncomment below to use "simple server socket example"
//        try (ServerSocket serverSocket = new ServerSocket(8080)) {
//
//            Socket socket = serverSocket.accept();
//
//            OutputStream outputStream = socket.getOutputStream();
//            PrintWriter printWriter
//                    = new PrintWriter(new OutputStreamWriter(outputStream));
//
//            String response = "HTTP/1.1 200 OK\r\n";
//            response += "Content-Type: text/html\r\n";
//            response += "\r\n";
//            response += "<p>Hello</p>\r\n";
//            printWriter.write(response);
//            printWriter.flush();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        writeTextToFile("nonexisting.txt", "Hello");


        //  FIXME: uncomment below to use "adapter example"
//        infoService = new EuropeInfoService();
//
//        Information ivanPetrenko = infoService.getInfo("Ivan Petrenko");
//        System.out.println(ivanPetrenko);
//
//        infoService = new USAInfoServiceAdapter(new USAService());
//        infoService.getInfo("John Doe");


        //  FIXME: uncomment below to use "Decorator example"
//        notifier = new SMSNotifier(new DefaultNotifier());
//
//        notifier.sendMessage("Hello");
    }

    private static void writeTextToFile(String fileName, String text) {
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {

            out.write(text.getBytes());

            out.flush();


        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file " + fileName);
        } catch (IOException e) {
            System.out.println("Couldn't use Output stream " + e.getMessage());
        }
    }

    private static String readFromFile(String name) {
        String text = "";

        try (InputStream in = new BufferedInputStream(new FileInputStream(name))) {

            int b;
            byte[] buf = new byte[10];

            while ((b = in.read(buf)) != -1) {
                text += new String(Arrays.copyOf(buf, b));
            }

            return text;

        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file " + name);
        } catch (IOException e) {
            System.out.println("Couldn't read the file");
        }
        return null;
    }

}
