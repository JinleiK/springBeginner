package com.jinlei.spring.test.springWiring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	
//	@Autowired
//	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
//		this.consoleWriter = consoleWriter;
//		this.fileWriter = fileWriter;
//	}
//	
//	@Autowired
//	@Qualifier("toconsole")
	@Inject
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
//	@Autowired
	@Inject
	@Named(value="fileWriter")
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeConsole(String text) {
		if(consoleWriter != null)
			consoleWriter.write(text);
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
}
