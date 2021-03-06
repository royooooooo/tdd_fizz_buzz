# FizzBuzz
===========

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有120名学生在上课。游戏的规则是：

1. 让所有学生拍成一队，然后按顺序报数。
2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
4. 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
5. 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
6. 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
7. 如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报FIzz，其他case自己补齐。

task:

1. 程序能够返回给到的数字进行报数 1,2,3 -> 1,2,3；
2. 当给的数字里面是3的倍数，应该说相应的单词Fizz 3 -> Fizz；
3. 当给的数字里面是5的倍数，应该说相应的单词Buzz 5 -> Buzz；
4. 当给的数字里面是7的倍数，应该说相应的单词Whizz 7 -> Whizz；
5. 当所报的数字里面同时是3、5的倍数，应该返回FizzBuzz 15 -> FizzBuzz；
6. 当所报的数字里面同时是5、7的倍数，应该返回BuzzWhizz 35 -> BuzzWhizz；
7. 当所报的数字里面同时是3、7的倍数，应该返回FizzWhizz 21 -> FizzWhizz；
8. 当所报的数字里面同时是3、5、7的倍数，应该返回FizzBuzzWhizz 105 -> FizzBuzzWhizz；
9. 当所报的数字里面包含3，应该返回Fizz 13 -> Fizz；
10. 当所报的数字里面包含3，忽略倍数的规则，应该只返回Fizz 30 -> Fizz；
11. 当所报的数字里面包含5，忽略包含3的规则，返回Buzz 35 -> BuzzWhizz；
12. 当所报的数字里面包含5，又是7的倍数，忽略3倍数的规则，返回BuzzWhizz 105 -> BuzzWhizz；
13.  当所报的数字里面包含7，忽略包含5的规则，忽略5倍数的规则 75 -> Fizz；



现在，我们需要你完成一个程序来模拟这个游戏，他的输出应该是输出（片段）：

```
1
2
Fizz
4
Buzz
Fizz
Whizz
8
Fizz
Buzz
11
Fizz 
Fizz
Wihzz
FizzBuzz
… 
一直到120 
```
你只需要实现核心逻辑就可以了。假设最外面已经有一个循环，比如：
 
```
for( int i = 0; i < 120; i++) {
    String result = fizzBuzz(i+1);
    System.out.println(result);
}
```  

你只需要实现里面的fizzBuzz函数，用TDD的方式。


## 已存在代码说明

已经存在的代码主要讲解如何使用测试,我们看到HelloWorldTest下有两个测试,第一个测试演示了如何进行集成测试。
第二个测试演示了如何进行mock。
