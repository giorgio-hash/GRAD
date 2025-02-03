package myCompilerPackage.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DependencyManager {

	public List<Dependency> dependencies;

	public void forEach(Consumer<? super Dependency> action) {
		dependencies.forEach(action);
	}

	public int size() {
		return dependencies.size();
	}

	public boolean isEmpty() {
		return dependencies.isEmpty();
	}

	public boolean contains(Object o) {
		return dependencies.contains(o);
	}

	public Iterator<Dependency> iterator() {
		return dependencies.iterator();
	}

	public Object[] toArray() {
		return dependencies.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return dependencies.toArray(a);
	}

	public boolean add(Dependency e) {
		return dependencies.add(e);
	}

	public boolean remove(Object o) {
		return dependencies.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return dependencies.containsAll(c);
	}

	public boolean addAll(Collection<? extends Dependency> c) {
		return dependencies.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Dependency> c) {
		return dependencies.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return dependencies.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return dependencies.retainAll(c);
	}

	public void replaceAll(UnaryOperator<Dependency> operator) {
		dependencies.replaceAll(operator);
	}

	//public <T> T[] toArray(IntFunction<T[]> generator) {
	//	return dependencies.toArray(generator);
	//}

	public void sort(Comparator<? super Dependency> c) {
		dependencies.sort(c);
	}

	public void clear() {
		dependencies.clear();
	}

	public boolean equals(Object o) {
		return dependencies.equals(o);
	}

	public int hashCode() {
		return dependencies.hashCode();
	}

	public Dependency get(int index) {
		return dependencies.get(index);
	}

	public Dependency set(int index, Dependency element) {
		return dependencies.set(index, element);
	}

	public void add(int index, Dependency element) {
		dependencies.add(index, element);
	}

	public boolean removeIf(Predicate<? super Dependency> filter) {
		return dependencies.removeIf(filter);
	}

	public Dependency remove(int index) {
		return dependencies.remove(index);
	}

	public int indexOf(Object o) {
		return dependencies.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return dependencies.lastIndexOf(o);
	}

	public ListIterator<Dependency> listIterator() {
		return dependencies.listIterator();
	}

	public ListIterator<Dependency> listIterator(int index) {
		return dependencies.listIterator(index);
	}

	public List<Dependency> subList(int fromIndex, int toIndex) {
		return dependencies.subList(fromIndex, toIndex);
	}

	public Spliterator<Dependency> spliterator() {
		return dependencies.spliterator();
	}

	public Stream<Dependency> stream() {
		return dependencies.stream();
	}

	public Stream<Dependency> parallelStream() {
		return dependencies.parallelStream();
	}

	@Override
	public String toString() {
		
		String s = "DependencyManager [dependencies=\n";
		for (Dependency dependency : dependencies) {
			s += "\t"+dependency+",\n";
		}
		
		return  s + "]";
	}
	
	
}
