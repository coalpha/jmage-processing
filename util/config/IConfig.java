package util.config;

import opre.Option;
import java.io.PrintStream;

public interface IConfig<K, V> extends util.IDisplay {
   Option<IEntry<K, V>> getEntry(K key);
   Option<V> get(K key);
   void set(K key, V val);
   void clear();
   /** Prints to System.out */
   void displayEntries();
   void displayEntries(PrintStream out);
   /** Serialize the config file and write it to the disk */
   void save();
   String toString();
}
