package es.codegym.task.pro.task15.task1534;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Desdoblar un archivo en partes
*/

public class Solution {

    public static void main(String[] args) {
        try (FileChannel channel = FileChannel.open(Paths.get("c:/test/file.txt"), StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buf = ByteBuffer.allocate(64);
            channel.read(buf);
            System.out.println("The file should still contain:\n" + new String(buf.array(), StandardCharsets.UTF_8));
            trimByPosition(channel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void trimByPosition(FileChannel fileChannel) throws IOException {
        fileChannel.truncate(fileChannel.position());

    }
}
