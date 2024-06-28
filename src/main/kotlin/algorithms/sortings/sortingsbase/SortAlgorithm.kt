package doomed.dumbs.algorithms.sortings.sortingsbase

import java.util.*


/**
 * The common interface of most sorting algorithms
 *
 */
interface SortAlgorithm {
    /**
     * Main method arrays sorting algorithms
     *
     * @param unsorted - an array should be sorted
     * @return a sorted array
     */
    fun <T:Comparable<T>> sort(unsorted:Array<T>):Array<T>

}