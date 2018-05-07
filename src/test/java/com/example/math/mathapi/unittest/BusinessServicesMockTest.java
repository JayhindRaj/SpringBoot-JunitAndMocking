package com.example.math.mathapi.unittest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.math.mathapi.service.BusinessServiceImpl;
import com.example.math.mathapi.service.DataService;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServicesMockTest {

	@Mock
	DataService dataService;
	
	@InjectMocks
	BusinessServiceImpl businessImpl;
	
	@Test
	public void testGetMax() {
		when(dataService.getAllData()).thenReturn(new int[] {25, 12, 6, 46});
		assertEquals(46, businessImpl.getMaxOfAllData());
	}
	
	@Test
	public void testGetSumOfGivenArray() {
		when(dataService.getAllData()).thenReturn(new int[] {25, 12, 6, -9, 3});
		assertEquals(37, businessImpl.getSum());
	}
	
	@Test
	public void testGetSumOfThree() {
		when(dataService.getAllData()).thenReturn(new int[] {25, 12, 6});
		assertEquals(43, businessImpl.getSum());
	}
	
	@Test
	public void testGetSumOfOne() {
		when(dataService.getAllData()).thenReturn(new int[] {25});
		assertEquals(25, businessImpl.getSum());
	}
	
	@Test
	public void testGetSumOfNone() {
		when(dataService.getAllData()).thenReturn(new int[] {});
		assertEquals(0, businessImpl.getSum());
	}
	
	@Test
	public void testGetGCD() {
		assertEquals(1, businessImpl.getGCD(3, 8));
	}
	
	@Test
	public void testGetLCM() {
		assertEquals(24, businessImpl.getLCM(3, 8));
		assertEquals(4, businessImpl.getLCM(4,4));
		assertEquals(9, businessImpl.getLCM(3, 9));
		assertEquals(12, businessImpl.getLCM(4, 6));
		assertEquals(30, businessImpl.getLCM(2, 15));
		assertEquals(60, businessImpl.getLCM(5, 12));
		assertEquals(13, businessImpl.getLCM(1, 13));
		assertEquals(32, businessImpl.getLCM(8, 32));
	}
}
