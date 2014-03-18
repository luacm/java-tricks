# Java Tips and Tricks

You learn a lot of Java here at Lehigh, but when it comes down to it, you're just scratching the surface.

## Java IDE's
IDE stands for Integrated Development Environment. It's basically an advanced code editor that provides extra features on top of editing text, like file management, automating builds, and testing. Dr. Java, the editor used in CSE 2, is not an IDE. Netbeans, often used in CSE 17, is. However, not many professionals use Netbeans. Instead, most of them use Eclipse and IntelliJ.

### Eclipse
Free to use. You can just grab the standard version. [Download](https://www.eclipse.org/downloads/)

### IntelliJ
There's a professional version you have to pay for, but they also have a free Community Edition that will satisfy all of your needs. This project includes IntelliJ project files to make getting started easy. [Download](http://www.jetbrains.com/idea/download/)

## Compiling a Project from the Command Line
If you stick with Java, at some point in your life, you'll run into a situation where you can't have an IDE compile for you. For example, for small things, I personally don't like to use IDEs at all. I use my favorite text editor, [Sublime Text](http://www.sublimetext.com/), which doesn't compile Java out of the box. Thankfully, doing simple Java compilations are a piece of cake (although they can quickly get quite complex).

1. Open your terminal of choice.
1. Navigate to the folder of your .java file.
1. To compile your program, first run the command ```javac YourFile.java```. This will create the file ```YourFile.class```. If there were any compilation errors, it'll tell you.
1. To actually run your program, use the command ```java YourFile```. Note that we didn't put any extension after ```YourFile```. If ```YourFile.class``` exists, Java will automatically grab and run it.
5. That's it! Pretty simple, right? You could write Java programs in Notepad this way (although I wouldn't recommend it...).
