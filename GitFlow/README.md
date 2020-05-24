<img src="https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/git-flow-logo.png" alt="drawing" width="250"/>

## [Init git flow](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git branch develop

$ git push -u origin develop

$ git branch -l
  develop
* master

$ git flow init
Which branch should be used for bringing forth production releases?
   - develop
   - master
Branch name for production releases: [master]

Which branch should be used for integration of the "next release"?
   - develop
Branch name for "next release" development: [develop]

How to name your supporting branch prefixes?
Feature branches? [feature/]
Bugfix branches? [bugfix/]
Release branches? [release/]
Hotfix branches? [hotfix/]
Support branches? [support/]
Version tag prefix? []
Hooks and filters directory? [C:/Users/carlmacd/Desktop/Library/.git/hooks]
```

## [Create Feature](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git checkout develop

$ git flow feature start feature_git_flow_summary

$ git checkout develop

$ git flow feature finish feature_git_flow_summary

// Example
$ git flow feature start microservice-architecture
Switched to a new branch 'feature/microservice-architecture'

Summary of actions:
- A new branch 'feature/microservice-architecture' was created, based on 'develop'
- You are now on branch 'feature/microservice-architecture'

Now, start committing on your feature. When done, use:

     git flow feature finish microservice-architecture
```

## [Create Release](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git flow release start release_0.1.0

$ git flow release finish 'elease_0.1.0'
```

## [Create Hotfix](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git flow hotfix start hotfix_branch

$ git flow hotfix finish hotfix_branch
```

[atlassian gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)