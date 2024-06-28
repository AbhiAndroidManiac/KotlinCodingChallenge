package algorithms.twopointers;

/**
 * The Two-Pointer Technique
 * .........................
 * The two-pointer technique is a powerful approach used to solve
 * various problems involving arrays or linked lists efficiently.
 * It involves using two pointers (or indices) that traverse the data
 * structure in a coordinated manner to achieve a specific goal,
 * such as finding pairs with a given sum, reversing a segment of an array,
 * or partitioning data.
 * ``````````````````````
 * Key Concepts
 * -------------
 * 1.)Pointers Initialization:
 * ===========================
 * Typically, one pointer starts at the beginning of the array (left pointer)
 * and the other at the end (right pointer).
 * 2.)Movement Strategy:
 * =====================
 * Pointers move towards each other or in some coordinated way based on the
 * problem's requirements. This could be moving both pointers inward, moving
 * one pointer in a specific direction, or using different speeds for the pointers.
 * 3.)Condition Checking:
 * ======================
 * The pointers move until a certain condition is met, such as finding a pair of
 * elements that add up to a target sum or the pointers crossing each other.
 * <p>
 * Common Applications
 * -------------------
 * `{@link doomed.dumbs.algorithms.twopointers.PairOfGivnSum}`
 * 1.)Finding a Pair with a Given Sum in a Sorted Array
 * ....................................................
 * * Start with two pointers: one at the beginning (left) and one at the end (right).
 * * ................................................................................
 * * Calculate the sum of the elements at these pointers.
 * * ....................................................
 * * If the sum equals the target, return the pair.
 * * ..............................................
 * * If the sum is less than the target, move the left pointer to the
 * * right to increase the sum.
 * * ..........................
 * * If the sum is greater than the target, move the right pointer to the
 * * left to decrease the sum. Repeat until the pointers meet.
 * * .........................................................
 * 2.)Reversing a Portion of an Array
 * ..................................
 *
 */