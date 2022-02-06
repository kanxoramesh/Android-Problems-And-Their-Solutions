# Git Skill Assessments 

* #### What features does the distributed versioning system offer? Select all that apply.
1. Concurrency-  Concurrency means, a system where multiple things can progress at once.
2. Decentralization-  Decentralization means, a system that can be accessed from multiple places and there is no single source of truth.
3. Parallelism- Parallelism is ability to execute multiple things simultaneously.

* #### Which of the prevention rules can be used to avoid a git merge conflict?
1. Whenever it is possible, use a new file in preference to an existing one. 
  -Whenever it is possible, use a new file in preference to an existing one this way, the only ambiguity could happen is the same name and path of the file.
2. Do not organize imports.
  Do not organise imports It decreases the probability of editing the same line of code.
3. Do not always put your changes at the end of a file.
  Do not always put your changes at the end of a file This decreases the probability of editing the same line of code.
4. Push and pull changes as often as you can
  Push and pull changes as often as you can It Mitigates distributed nature of Git.

* #### What happens when executing a command to push a 1 GB project file to remote?
1. The push command fails due to the file exceeding the max file size restriction.

* #### After setting up your ssh connection to your GitHub repository, what code can you use to test if the connection is set up correctly?
1. ssh -T username@github.com 
-T is a valid flag and is used to test if ssh setup to github is successful or not.

* #### In a public GitHub repository, what restricts the potential reuse of the repository’s code?
1. License
Licensing a repository is a feature in most of the VCS programs. This associates repository to shorthand licensing terms, regulating the code use in future.

* #### Your current repository has three branches: master, beta, and minor-enhancements. You just finished the enhancements and commit the changes to the minor-enhancements branch, and you want to include them in beta branch. How can you accomplish this?
1. Check out the beta branch and run git merge minor-enhancements.
To mere the minor-enhancements branch in beta branch first you have to checkout to beta branch using command git checkout beta and run command git merge minor-enhancements to accomplish the task.

* #### Which method is used to alter the history that is in sync with the remote branch?
1. push --force
The push –force can be used to make changes in history which is generally discouraged to use.

* #### What is a possible option for --color flag?
1. always, never and auto
Correct choices are always, never and auto.

* #### You stashed some changes that can be accessed with ref `stash@{1}`.  You need to create a separate branch named “add-stylesheet” that contains that stash's content. How do you do this?
1. Enter ` git stash branch add-stylesheet stash@{1}`.
`git stash branch add-stylesheet stash@{1}` creates a new branch out of stash content. Hence its a right choice.

* #### What error message does Git display when one user pushes main branch changes to a remote repository at the same time another user pushes changes to the same branch?
1. rejected
Rejected is the response because git won't allow you to push to remote which has diverted from local's head.

* #### Which git command can be used to check the stored stashes?
1. git stash list

* #### What command enables you to view the last five commits in your repository?
1. git log -5
git log -n where n is the number of latest commit user wants to log.

* #### What is the correct command to see all the branches that contain unmerged work?
1. git branch --no-merged

* #### What happens after creating a new branch in the local Git repository and pushing it to remote without explicitly setting up an upstream branch?
1. The new branch is automatically created on the remote repository and the push is successful.
 Since both remote and local have the same branch name, git will associate the two branches as related without upstream/tracking information.

* #### When adding a GitHub user to the repository as a collaborator who doesn’t have permission to delete the repository, which permission level should be assigned to the collaborator?
1. Write
Write access allows the user to push changes to the repository so this is the correct option.

