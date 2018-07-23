package ua.nure.brovenko.SummaryTask4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ua.nure.brovenko.SummaryTask4.command.*;
import ua.nure.brovenko.SummaryTask4.command.admin.*;
import ua.nure.brovenko.SummaryTask4.command.entrant.*;
import ua.nure.brovenko.SummaryTask4.encriptor.PasswordEncriptorTest;
import ua.nure.brovenko.SummaryTask4.entity.*;
import ua.nure.brovenko.SummaryTask4.logic.LoginLogicTest;
import ua.nure.brovenko.SummaryTask4.resources.RandomStringGenerator;
import ua.nure.brovenko.SummaryTask4.resources.RandomStringGeneratorTest;

/**
 * All tests class
 * @author Ivan Brovenko
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AdmissionTest.class, ApplicationTest.class, AtestatTest.class,
        DepartmentTest.class, EntrantTest.class,FinalAdmissionTest.class,SubjectTest.class,
        UniverTest.class,UserTest.class, PasswordEncriptorTest.class, LoginLogicTest.class,
        AddDepartmentCommandTest.class, AddToAdmissionCommandTest.class, BlockEntrantCommandTest.class,
        DeleteDepartmentCommandTest.class, DepartmentManagementCommandTest.class,EditDepartmentCommandTest.class,
        EntrantDepartmentsCommandTest.class,EntrantInfoCommandTest.class,EntrantZnoInfoCommandTest.class,
        FinalAdmissionCommandTest.class,ManagementCommandTest.class,SendEmailCommandTest.class,
        UpdateDepartmentCommandTest.class, AccountCommandTest.class, CongratsCommandTest.class,
        FinalRegistrantionCommandTest.class, RegAtestatCommandTest.class, SaveZnoCommandTest.class,
        WatchInformationCommandTest.class,WatchSavedApplicationCommandTest.class, EmailSignUpCommandTest.class,
        EmptyCommandTest.class, LoginCommandTest.class, LogoutCommandTest.class, SignUpCommandTest.class,
        EntrantManagementCommandTest.class,ContactAdminCommandTest.class,UnblockEntrantCommandTest.class,
        BlackListCommandTest.class,FileUploadingCommandTest.class,ForgotPasswordCommandTest.class,
        RandomStringGeneratorTest.class})
public class AllTests {
}
