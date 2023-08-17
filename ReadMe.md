## Test
```shell
cd native 
cargo build
sudo apt install libappindicator-dev
nm -D *.so
```
## References
1. [JEP 434: Foreign Function & Memory API (Second Preview)](https://openjdk.org/jeps/434)
2. [Java Preview Features](https://www.baeldung.com/java-preview-features)
3. [How to Enable Java Preview Features and Run Code from IntelliJ IDEA](https://nljug.org/intellijidea/how-to-enable-java-preview-features-and-run-code-from-intellij-idea/)
4. [Building and using dynamic link libraries in Rust](https://prog.world/building-and-using-dynamic-link-libraries-in-rust/#create_dyn_lib)