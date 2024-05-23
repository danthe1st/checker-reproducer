package io.github.danthe1st.checkertest;

import java.util.List;

public class TestClass {
	
	public List<TargetOuter> getUserData(List<SrcOuter> input) {
		return input
			.stream()
			.map(
					c -> new TargetOuter(
							c
								.data()
								.stream()
								.map(
										inner -> new TargetInner(
												inner.data(),
												inner.data(),
												inner.data(),
												inner.data()
										)
								).toList()
					)
			).toList();
	}
	
	record SrcOuter(List<SrcInner> data) {
	}
	
	record SrcInner(int data) {
	}
	
	record TargetOuter(List<TargetInner> inner) {
	}
	
	record TargetInner(int a, int b, int c, int d) {
	}
}
