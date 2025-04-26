# devcontainer-java17-gradle-gcloudcli

This is a development container for Java 17, Gradle, and the Google Cloud SDK with the following components:

- OpenJDK 17
- Gradle
- Google Cloud SDK
- Docker CLI

*This README is written by ChatGPT.*

## Usage

To use this development container, you need to have Visual Studio Code and the [Remote Development extension pack](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack) installed.

1. Create a new directory for your Gradle project.
2. Open the directory in Visual Studio Code.
3. Press `Ctrl + Shift + P` to open the command palette and search for ">Gradle: Create a Gradle Project".
4. Select the directory you just created.
5. A new Gradle project will be generated in the selected directory.
6. Clone this repository or download the `devcontainer.json` file.
7. Copy the `devcontainer.json` file to the root of your Gradle project.
8. Open the Gradle project in Visual Studio Code.
9. A prompt will appear at the bottom right corner of the screen, asking if you would like to reopen the repository in the container. Click "Reopen in Container".
10. The container will be built and started. This may take a few minutes the first time, but subsequent starts will be much faster.
11. Once the container is started, you can use Visual Studio Code's integrated terminal to execute Gradle commands, run tests, and interact with the Google Cloud SDK.

### Using gcloud

To use `gcloud` commands for managing Google Cloud resources, you first need to log in to Google Cloud Platform using the `gcloud auth` command-line tool. 

1. In the terminal in Visual Studio Code, run the following command to log in to Google Cloud Platform with the `gcloud` command-line tool:
```
gcloud auth login
```

If you want to use the `gcloud` command-line tool with Application Default Credentials, you can run the following command instead:
```
gcloud auth application-default login
```
2. Use the terminal in Visual Studio Code to run `gcloud` commands for managing Google Cloud resources.

## Configuration

This development container is preconfigured with Java 17, Gradle, and the Google Cloud SDK. If you need to make further configuration changes, you can modify the `devcontainer.json` file to suit your needs.

## License

This development container is licensed under the [MIT License](LICENSE).
