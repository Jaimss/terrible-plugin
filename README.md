[![Build Status](https://ci.jaims.dev/job/terrible-plugin/badge/icon)](https://ci.jaims.dev/job/terrible-plugin/)
# terrible-plugin
A terrible plugin! Check out [CONTRIBUTING.md](./CONTRIBUTING.md) for more information!

**Notice: This project is intended to be terrible, hence the name.**

### Testing
If you need to test your terrible plugin, you can do so using the `docker-compose.yml`. Simply call `docker-compose up -d` to start up the server.

If you need console access, visit [`localhost:4326`](http://localhost:4326) and add the console widget, or use `docker attach terribleplugin-mc` and run commands in the console there. You will need to copy the dependencies and whatnot into the plugins folder located in the `dev-server` directory. If you use the `buildToDevServer` gradle task, it will build `terrible-plugin` and copy it over, but not any other dependencies.

The username and password are `admin`.
