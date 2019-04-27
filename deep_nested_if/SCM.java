package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class SourceControlManager
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public boolean checkin(SCMServer scmServer, CICDServer cicdserver, String userName, String passwd, String commitMsg, Change[] changes)
    {
        if (scmServer != null && scmServer.isConnected())
        {
            if (cicdServer != null && cicdServer.isReady())
            {
                if (userName != null)
                {
                    if (passd != null && passwd.length() > 15)
                    {
                        if (commitMsg != null && commitMsg < 200)
                        {
                            if (changes != null && changes.length() > 0)
                            {
                                System.out.println("Ready to push to SCM server.");
                                scmServer.push(userName, passwd, commitMsg, changes);
                                System.out.println("Finish to push to SCM server.");
                                return 0;
                            } else {
                                System.out.println("No change.");
                                return 1;
                            }
                        } else {
                            System.out.println("Invalid Commit message.");
                            return 2;
                        }
                    } else {
                        system.out.println("Invalid passwd.");
                        return 3;
                    }
                } else {
                    system.out.println("Invalid user name.");
                    return 4;
                }
            } else {
                system.out.println("cicd server problem.");
                return 5;
            }
        } else {
            system.out.println("scm server problem.");
            return 6;
        }
    }
}
