/**
 * @description:
 * 测试类用于对 Solution10 中的 fractionAddition 方法进行单元测试。
 *
 * **测试用例设计原则：**
 *
 * 1. **等价类划分**：将所有可能的输入分为若干等价类，选取具有代表性的测试用例进行测试。
 *    - **有效等价类**：合法的分数表达式字符串。
 *    - **无效等价类**：非法的分数表达式字符串（本题中题目已保证输入合法，可忽略）。
 *
 * 2. **边界值分析**：针对输入的边界条件进行测试，如最大值、最小值等。
 *
 * 3. **特殊值测试**：测试一些特殊情况，如零值、负值等。
 *
 * 4. **综合测试**：组合多种情况，测试方法在复杂表达式下的正确性。
 *
 * **测试目的：**
 *
 * - 验证 fractionAddition 方法在不同类型的输入下，是否能够返回预期的结果。
 * - 测试方法在处理不同符号、分子分母组合、以及不同长度的表达式时的正确性。
 */
public class L2022211911_10_Test {

    /**
     * 测试目的：测试简单的正负分数相加，结果为零的情况。
     * 测试用例："-1/2+1/2"
     */
    @Test
    public void testSimpleAdditionResultZero() {
        Solution10 solution = new Solution10();
        String expression = "-1/2+1/2";
        String expected = "0/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试多个分数相加，结果为正分数的情况。
     * 测试用例："-1/2+1/2+1/3"
     */
    @Test
    public void testMultipleAdditionPositiveResult() {
        Solution10 solution = new Solution10();
        String expression = "-1/2+1/2+1/3";
        String expected = "1/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试分数相减，结果为负分数的情况。
     * 测试用例："1/3-1/2"
     */
    @Test
    public void testSubtractionNegativeResult() {
        Solution10 solution = new Solution10();
        String expression = "1/3-1/2";
        String expected = "-1/6";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试结果为整数的情况。
     * 测试用例："5/3+1/3"
     */
    @Test
    public void testAdditionResultInteger() {
        Solution10 solution = new Solution10();
        String expression = "5/3+1/3";
        String expected = "2/1";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试负分数相加，结果为负分数的情况。
     * 测试用例："-2/3+1/3"
     */
    @Test
    public void testNegativeFractionsAddition() {
        Solution10 solution = new Solution10();
        String expression = "-2/3+1/3";
        String expected = "-1/3";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试多个分数相加减，包含不同分母的情况。
     * 测试用例："7/10-2/5+1/2"
     */
    @Test
    public void testMixedFractionsOperations() {
        Solution10 solution = new Solution10();
        String expression = "7/10-2/5+1/2";
        String expected = "4/5";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试含有多个操作数和运算符的复杂表达式。
     * 测试用例："1/2+1/3-1/4+1/5-1/6+1/7-1/8+1/9-1/10"
     */
    @Test
    public void testComplexExpression() {
        Solution10 solution = new Solution10();
        String expression = "1/2+1/3-1/4+1/5-1/6+1/7-1/8+1/9-1/10";
        String expected = "53329/27720";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }

    /**
     * 测试目的：测试分数和整数的组合。
     * 测试用例："2/1-3/2"
     */
    @Test
    public void testFractionAndIntegerCombination() {
        Solution10 solution = new Solution10();
        String expression = "2/1-3/2";
        String expected = "1/2";
        String result = solution.fractionAddition(expression);
        Assert.assertEquals(expected, result);
    }
}
