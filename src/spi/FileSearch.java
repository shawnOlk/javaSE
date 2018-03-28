package spi;
public class FileSearch implements Search {
    @Override
    public void search() {
        System.out.println("哥是文件搜索");
    }
}