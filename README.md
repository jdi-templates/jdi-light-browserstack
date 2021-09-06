# JDI with Browserstack test project

Before running JDI project in Sauce Lab, you need to set up Sauce Lab Credentials

#### Set Your Browserstack Credentials
1. Copy your Browserstack **username** and **accessKey** in the [User Settings](https://www.browserstack.com/accounts/settings).
2. Open a Terminal window (command prompt for Windows) and set your Sauce Labs Environment variables:   
   ###### Mac OSX:
   ```
   $ export USERNAME="username"
   $ export ACCESS_KEY="accessKey"
   ```
   ###### Windows:
   ```
   > set USERNAME="username"
   > set ACCESS_KEY="accessKey"
   ```
   > To set an environment variables permanently in Windows, you must append it to the `PATH` variable.
   
   > Go to **Control Panel > System > Windows version > Advanced System Settings > Environment Variables > System Variables > Edit > New**
   
   > Then set the "Name" and "Value" for each variable
   
9. Test the environment variables
    ###### Mac OSX:
    ```
    $ echo $USERNAME
    $ echo $ACCESS_KEY
    ```
    > ***WARNING FOR UNIX USERS!***:
    > If you have problems setting your environment variables, run the following commands in your terminal:
    ```
    $ launchctl setenv USERNAME $USERNAME
    $ launchctl setenv ACCESS_KEY $ACCESS_KEY
    ```
    ###### Windows:
    ```
    > echo %USERNAME%
    > echo %ACCESS_KEY%
    ```

<br />

#### Required Browserstack Capabilities

The list of capabilities can be found [here](https://www.browserstack.com/automate/capabilities)

#### JDI options

In order to run test with Browserstack you need set up remote settings in test.properties file.

> remote.type=browserstack
> 
> driver.remote.run=true

And that it. Set Browserstack capabilities, set remote execution in test.properties and you can run test with Browserstack

#### Alternative way to run tests using CLI (you don't need to set env properties preliminary in your OS)

    mvn -DUSERNAME=your_user_name -DACCESS_KEY=your_access_key clean install
    mvn allure:serve