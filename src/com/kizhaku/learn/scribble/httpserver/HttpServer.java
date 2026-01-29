package com.kizhaku.learn.scribble.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HttpServer {
    private static String RESPONSE = "HTTP/1.1 200 OK\r\n\r\n";

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4222);
        System.out.println("Connection opened");

        while (true) {
            try (Socket connection = socket.accept()) {
                System.out.println("Connection accepted");

//                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                br.lines();
//
//                connection.getInputStream().readAllBytes();
//                new InputStreamReader(connection.getInputStream())
//                BufferedReader(new InputStreamReader(connection.getInputStream()));

                //InputStreamReader reader = new InputStreamReader(connection.getInputStream());
//                int ch;
//                while ((ch = reader.read())) {
//                    System.out.print((char) ch);
//                }

                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                System.out.println("Printing stream: ");
                System.out.println(br.readLine());

                Map<String, String> headers = br.lines()
                        .takeWhile(l -> !l.isEmpty())
                        .map(l ->  l.split(":", 2))
                        .collect(Collectors.toMap(h -> h[0].trim(), h -> h[1].trim()));

                headers.forEach((k, v) -> System.out.println(k +": "+ v));

                OutputStream out = connection.getOutputStream();
                out.write(RESPONSE.getBytes());
                out.flush();
                System.out.println("Response sent");
            } catch (Exception ex) {

            }
        }
    }

    private static void setHttpRequest(Socket connection) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String requestPath = br.readLine().split(" ")[1];

        Map<String, String> headers = br.lines()
                .takeWhile(l -> !l.isEmpty())
                .map(l ->  l.split(":", 2))
                .collect(Collectors.toMap(h -> h[0].trim(), h -> h[1].trim()));

        HttpRequest request = new HttpRequest(requestPath, headers);

        System.out.println(br.readLine());
    }
}
