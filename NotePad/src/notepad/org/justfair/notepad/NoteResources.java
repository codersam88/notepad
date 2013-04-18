/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.org.justfair.notepad;


import java.util.prefs.Preferences;
import notepad.org.justfair.notepad.Constants.Pref;

/**
 *
 * @author vinnu
 */
public class NoteResources {
    public static boolean ARG_FORCE_VERSION;
    
    public static String getUserPath(String path){
        return Preferences.userRoot().node(Constants.PREF_NODE).get(Pref.SUSER_DIR, path);
    }
    
    public static String getUserpath(){
        return Preferences.userRoot().node(Constants.PREF_NODE).get(Pref.SUSER_DIR,System.getProperty("user.home"));
    }
}
