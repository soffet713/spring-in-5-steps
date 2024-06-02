package com.spring.basics.spring_in_5_steps.cdi;

import com.spring.basics.spring_in_5_steps.SpringIn5StepsCdiApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;

	@Mock
	SomeCdiDao daoMock;

	@Test
	void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 4});
		assertEquals(4, business.findGreatest());
		System.out.println(business.findGreatest());
	}

	@Test
	void testBasicScenario1() {
		Mockito.when(daoMock.getData()).thenReturn(new int[]{123, 43, 924, 21, 2590});
		assertEquals(2590, business.findGreatest());
		System.out.println(business.findGreatest());
	}

	@Test
	void testBasicScenario2() {
		Mockito.when(daoMock.getData()).thenReturn(new int[]{3, 7, 4, 245, 72, 24, 13});
		assertEquals(245, business.findGreatest());
		System.out.println(business.findGreatest());
	}

}
