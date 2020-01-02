# spring-boot-skaffold-example
Watch local files, build, deploy to minikube

Project consists of
- basic ```Dockerfile```
- basic ```Maven``` build tool 
- basic ```skaffold``` configuration with custom build-step

> I tried to use each tools(Docker, Maven, Skaffold, ...) basic function & configuration.

<br>

### Deployment Flow

1. Watch local files in pre-defined paths in ```skaffold.yaml```
2. If changes are detected, start build-step.  
3. And deploy to minikube 

> Because I use Intellij, and I don't want frequent deployment, so my skaffold configuration don't watch java source files(*.java).
> With my example, skaffold just run deployments when I run the build menu in Intellij.   

<br>

### Run Example 

```sh
$ skaffold dev
```