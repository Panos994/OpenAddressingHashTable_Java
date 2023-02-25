# OpenAddressingHashTable_Java
OpenAddressingHashTable project.



#App

Our project is called App because of the main class name, which is App. Our java project consists of 3 classes. The main class, which name is App, a second class which is the interface of our program called Dictionary and a third class
which implements this interface with the name of OpenAddressingHashTable. The main class reads words from file and adds them to the hash Table which is implemented in the OpenAddressingHashTable class. When the reading process
is finished then, in the console appear the number of occurencies of each word read. Dictionary interface contains methods that are implemented in OpenAddressingHashTable class. Finally, OpenAddressingHashTable class as mentioned before
implements the methods of the Dictionary interface.

# Usage

mvn package

...

java -cp target/App-1.0-SNAPSHOT.jar com.mycompany.app.App filepath_for_text_file(ex. home/john/file.txt) 
