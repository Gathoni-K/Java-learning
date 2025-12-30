/*
-In OtakuBoxd, we want to represent our watch status:
    PLAN_TO_WATCH
    WATCHING
    COMPLETED
    DROPPED

-Each status should have a user friendly label.
-Decide whether progress updates are allowed
    'boolean canUpdateProgress'

Requirements:
1.Store the label inside the enum.
2.Implement logic per status.



*/
package Notes.Enum;

public enum WatchStatus {
    PLAN_TO_WATCH("Plan to Watch"){
        @Override
        public boolean canUpdateProgress() { return false;}
    },
    WATCHING("Watching"){
        @Override
        public boolean canUpdateProgress() {
            return true;
        }
    },
    COMPLETED("Completed"){
        @Override
        public boolean canUpdateProgress(){
            return false;
        }
    },

    protected final String label;

    WatchStatus(String label){
        this.label = label;
    }

    public abstract boolean canUpdateProgress();
    //this tells Java that every constant must implement the method 'canUpdateProgress()'

}
