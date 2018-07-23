package ua.nure.brovenko.SummaryTask4.command;


import ua.nure.brovenko.SummaryTask4.entity.User;

/**
 * Abstract class that should be extended
 * only by commands that entrant that still not in an admission does
 * @author Ivan Brovenko
 */
public abstract class EntrantCommand implements ActionCommand {

    /**
     * Method for checking whether current user is entrant
     * @param user user object who's rights should be checked
     * @return boolean value
     */
    @Override
    public boolean checkAccess(User user) {

        if(user != null && user.getRole() !=null && (user.getRole().equals("entrant")||
                user.getRole().equals("reg_entrant"))){
            return true;
        }

        return false;
    }
}
