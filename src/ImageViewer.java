import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * A program for viewing images.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 * 文档注释，一般编写类描述、时间、作者
 */
public class ImageViewer
{
    // 程序主方法
    public static void main(String[] args)
    {

        //lambda表达式相当于
        /*
        *  EventQueue.invokeLater(){
        * public void invokeLater(){
        * }
        * }*/
        EventQueue.invokeLater(() -> {
//            new一个窗口
            JFrame frame = new ImageViewerFrame();
//            设置窗口名
            frame.setTitle("ImageViewer");
//            关闭窗口
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            是否可视
            frame.setVisible(true);
        });
    }
}

/**
 * A frame with a label to show an image.
 * 一个窗口和标签展示图片
 */

class ImageViewerFrame extends JFrame
{
//    定义标签和关闭
    private JLabel label;
    private JFileChooser chooser;
//    定义窗口的长宽
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;


    //窗口属性
    public ImageViewerFrame()
    {
//        设置窗口大小
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // use a label to display the images
//        使用一个标签来展示图片
        label = new JLabel();
        add(label);

        // set up the file chooser
//        新建一个选择器
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // set up the menu bar
//        新建一个目录
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("文件");
        menuBar.add(menu);

//        新建一个打开目录按钮
        JMenuItem openItem = new JMenuItem("打开");
//        将此按钮添加到目录
        menu.add(openItem);
//        设置按钮监听事件
        openItem.addActionListener(event -> {
            // show file chooser dialog
//            展示文件选择器
            int result = chooser.showOpenDialog(null);

//            展示图标到窗口
            // if file selected, set it as icon of the label
            if (result == JFileChooser.APPROVE_OPTION)
            {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

//        退出
        JMenuItem exitItem = new JMenuItem("退出");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
