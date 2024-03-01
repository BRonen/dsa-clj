FROM clojure
WORKDIR /home/app/
# COPY project.clj /usr/src/app/
# RUN lein deps
# COPY . .
# RUN mv "$(lein uberjar | sed -n 's/^Created \(.*standalone\.jar\)/\1/p')" app-standalone.jar
# CMD ["java", "-jar", "app-standalone.jar"]
CMD ["bash"]