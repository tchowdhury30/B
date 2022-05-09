Insomniac Raccoons :: Faiza Huda, Tasnim Chowdhury, Diana Akhmedova
APCS pd8
HW93 -- A Tree Grows in 251 (exploring tree properties, extracting actionable intel from traversals)
2022-05-05r
time spent: 1 hrs


DISCO
------------------------------------------------
* pre-order:
1. Process the node.
2. Traverse the left subtree.
3. Traverse the right subtree.

* post-order:
1. Traverse the left subtree.
2. Traverse the right subtree.
3. Process the node.

* in-order:
1. Traverse the left subtree.
2. Process the root.
3. Traverse the right subtree.
================================================


QCC
------------------------------------------------
* Where did man come from?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
* Down.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
* Open tour, with no cycles with a number of paths to take away from the root dependent on the number of nodes.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
* To maximize efficiency when traversing trees.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
* The heights of a node's children differ by 1 or less.

Is a perfect tree complete?
* Yes, because every level is filled in.

Is a complete tree balanced?
* Yes, because the heights of the left and right subtrees of any node in a complete tree differ by 1 or less, because every level is filled in, except possibly the last level.

Is the Man Who Is Tall Happy?
* The Man Who Is Tall Is Happy. The second "Is" has a smaller depth, and we use that one.

What must be true of perfect trees but not others?
*  All levels must be filled out and it is a tree that is complete and balanced.
================================================


C'EST POSSIBLE?
------------------------------------------------
* In Pre-Order traversal, the root is in the beginning (then left then right).
* In In-Order traversal, the root is in the middle of left and right.
* Using this, we can constrct the tree.
================================================

Pre Order- EGDKINLOW
In Order- EKDNIOLW

        E
          \
           G
          /
         D
        / \
       K   I
          / \
         N   L
            / \
           O   W
