/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad.impl.core;


import notepad.org.justfair.notepad.Constants;
import notepad.org.justfair.notepad.NoteResources;
import notepad.org.justfair.notepad.core.AbstractMain;
import org.apache.log4j.Logger;

/**
 *
 * @author vinnu
 */
public class MainImpl extends AbstractMain{
    public MainImpl(String [] args){
        super(args);
    }
    private static Logger logger=Logger.getLogger(MainImpl.class);
    
    protected void init(String[] args){
        
    }
    
    private void loadArguments(String[] args){
        for(String arg:args){
            if(arg.equals("-forceversion")){
                NoteResources.ARG_FORCE_VERSION=true;
            }
        }
    }
    
    private void loadPropertyFile(){
        String useDirKey="notepad.user.dir";
        String gnPath=NoteResources.getUserpath()+ Constants.PATH_ROOT;
    }
}
