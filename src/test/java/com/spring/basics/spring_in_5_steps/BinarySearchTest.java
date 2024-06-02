package com.spring.basics.spring_in_5_steps;

import com.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;
	@Test
	void testBasicScenario() {
		int actualResult = binarySearch.binarySearch(new int[]{1,7,9}, 5);
		assertEquals(3, actualResult);
	}

}
