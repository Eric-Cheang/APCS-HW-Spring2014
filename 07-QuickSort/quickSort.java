import java.io.*;
import java.util.*;

public class quickSort{

	private int[] a;
	private int low = 0;
	private int high = a.length - 1;

	public quickSort(int[] givenArray){
		a = givenArray;
	}
	
	private int partition(int[] array, int R, int L){
	 	int pivot = array[R + L / 2];
	 	array[R + L / 2] = array[L];
	 	array[L] = pivot;

	 	int wall = 0;
	 	for (int x = R; x <= L; x++){
	 		if (array[x] < pivot){
	 			int switchInt = array[x];
	 			array[x] = array[wall];
	 			array[wall] = switchInt;
	 			wall++;
	 		}
	 	}
	 	int swapWall = array[wall];
	 	array[wall] = pivot;
	 	array[L] = wall;
	 	int returnInt = 0;
	 	for (int x : array) {
	 		if (x == pivot){
	 			return returnInt;
	 		}
	 		returnInt++;
	 	}
	 	return 877;
	}

	public int[] qSort(){
		int[] array = a;
		int L = low;
		int H = high;
		int[] returnArray = new int[a.length];

		if (L == H){
			return returnArray;
		}
		else{
			int pivotInt = partition(a, H, L);
			returnArray[pivotInt] = array[pivotInt];
			a = array;
			qSort();
		}


