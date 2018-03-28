package spi;
public class DataBaseSearch implements Search {
    /**
     * 最后在META-INF/services目录下创建spi.Search(包名+接口名)文件，

     当文件内容为spi.FileSearch（包名+实现类名）时，程序输出结果为：哥是文件搜索

     当内容为spi.DataBaseSearch时，程序输出结果为：哥是database搜索.

     由此可以看出DOSearch类中没有任何和具体实现有关的代码，而是基于spi的机制去查找服务的实现。
     */
    @Override
    public void search() {
        System.out.println("哥是database搜索");
    }

}