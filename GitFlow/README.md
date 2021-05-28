<img src="https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/git-flow-logo.png" alt="drawing" width="250"/>

## [What´s GitFlow ? 🙄](https://github.com/markdown-it/markdown-it-emoji)

Gitflow Workflow is a Git workflow design that was first published and made popular by __Vincent Driessen__ at nvie. The Gitflow Workflow defines a strict branching model designed around the project release. This provides a robust framework for managing larger projects.

### [Master](https://github.com/markdown-it/markdown-it-emoji)

 The master branch stores the official release history, this is production code.

### [Develop](https://github.com/markdown-it/markdown-it-emoji)

 The develop branch serves as an integration branch for features.

### [Feature](https://github.com/markdown-it/markdown-it-emoji)

 The feature branches use to develop as their parent branch and start coding new features on this branch. When a feature is complete, it gets merged back into develop. Features should never interact directly with master.

### [Release](https://github.com/markdown-it/markdown-it-emoji)

  The release branch gets merged into master and tagged with a version number. In addition, it should be merged back into develop

### [Hotfix](https://github.com/markdown-it/markdown-it-emoji)

The hotfix branches are a lot like release branches and feature branches except they're based on master instead of develop. 

![](https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/gitflow-system.png)

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

## [Create a new feature](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git checkout develop

$ git flow feature start feature_git_flow_summary

$ git push --set-upstream origin feature/feature_git_flow_summary

$ git checkout develop

$ git flow feature finish feature_git_flow_summary
```

## [Create a new release](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git flow release start release_1.0

$ git flow release finish 'release_1.0'
```

## [Create a new hotfix](https://github.com/markdown-it/markdown-it-emoji)

```console
$ git flow hotfix start hotfix_branch

$ git flow hotfix finish hotfix_branch
```

Source: [atlassian gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) 🔗

> thank you for reading