package com.incquerylabs.conptest.test;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.incquerylabs.conptest.ArrowheadDirect;
import com.incquerylabs.conptest.ArrowheadDirectRec;
import com.incquerylabs.conptest.Server;

public class DirectTest {
	Server server;
	
	@Before
	public void setup() {
		ArrowheadDirectRec rec = new ArrowheadDirectRec();
		File file = new File(".gitignore");
		ArrowheadDirect sender = new ArrowheadDirect(file);
		server = new Server(sender);
		rec.start();
	}
	
	@Test
	public void sendSmallFile() {
		server.go();
	}
	
}