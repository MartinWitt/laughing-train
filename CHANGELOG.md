# Changelog

## [1.3.0](https://github.com/MartinWitt/laughing-train/compare/v1.2.0...v1.3.0) (2023-07-26)


### Features

* **graphql:** Add 2 new graphql endpoints to get results for analyzers ([#852](https://github.com/MartinWitt/laughing-train/issues/852)) ([5078a48](https://github.com/MartinWitt/laughing-train/commit/5078a48b0df2a73ecb62820e240b509f7cd69806))
* **graphql:** Add graphql endpoint for analyzerstatus ([#863](https://github.com/MartinWitt/laughing-train/issues/863)) ([fc89ddf](https://github.com/MartinWitt/laughing-train/commit/fc89ddfb821a482da0191729a883f64c35bf6e3a))
* **react:** Change dashboard UI to new table ([#876](https://github.com/MartinWitt/laughing-train/issues/876)) ([a9b3c9c](https://github.com/MartinWitt/laughing-train/commit/a9b3c9cafac5215fa54914537d2df29421deb18e))
* **spoon:** Add EqualsHashcode badsmell ([#899](https://github.com/MartinWitt/laughing-train/issues/899)) ([83ae327](https://github.com/MartinWitt/laughing-train/commit/83ae327679a984460167911b257aff84b98abd53))
* **spoon:** Add FinalStaticMethod analyzer ([#845](https://github.com/MartinWitt/laughing-train/issues/845)) ([c4ea0e8](https://github.com/MartinWitt/laughing-train/commit/c4ea0e83c1de31dd12c5e73d92036daa1cc0b40e))
* **spoon:** Improve snippet generation for spoon-analyzer ([#848](https://github.com/MartinWitt/laughing-train/issues/848)) ([3fa3323](https://github.com/MartinWitt/laughing-train/commit/3fa3323b84a0565e60e313d590eccfa1a8e98263))


### Bug Fixes

* **database:** Fix ConcurrentModificationException during database migration ([#857](https://github.com/MartinWitt/laughing-train/issues/857)) ([504e1c4](https://github.com/MartinWitt/laughing-train/commit/504e1c4c9196d2784c5d014923f5d2c72105ace5))
* **database:** Fix NPE in ProjectDao ([#867](https://github.com/MartinWitt/laughing-train/issues/867)) ([fde7a40](https://github.com/MartinWitt/laughing-train/commit/fde7a403a1008f466c9b238d5d0ba2fdf897b0ac))
* **spoon:** Also persist analyzerresults in database ([#866](https://github.com/MartinWitt/laughing-train/issues/866)) ([6e588ea](https://github.com/MartinWitt/laughing-train/commit/6e588ea88e4ccf13cb973b3034265ea8b5b47afd))
* **spoon:** Disable InnerClassMayBeStatic rule ([#896](https://github.com/MartinWitt/laughing-train/issues/896)) ([5484232](https://github.com/MartinWitt/laughing-train/commit/5484232eb7e8338efcc33eba887f3311a36092b1))
* **spoon:** Fix visitor not returning any result because of correct implemented visitor ([#847](https://github.com/MartinWitt/laughing-train/issues/847)) ([c65ac44](https://github.com/MartinWitt/laughing-train/commit/c65ac4428eceea1bd6f9dfce053aa84a10bbfe2e))
* **spoon:** Fix whitespaces in ruleIDs for spoon analyzer ([#854](https://github.com/MartinWitt/laughing-train/issues/854)) ([b7245a9](https://github.com/MartinWitt/laughing-train/commit/b7245a9c08f86ce5349c2f36c6a2427447c38214))
* **spoon:** Fix wrong filepath for badsmells ([#855](https://github.com/MartinWitt/laughing-train/issues/855)) ([e208bbe](https://github.com/MartinWitt/laughing-train/commit/e208bbe0c8db48bd6378174f7e4230dcdbe00830))
* **spoon:** Handle implicit ctors correct ([#853](https://github.com/MartinWitt/laughing-train/issues/853)) ([5452a96](https://github.com/MartinWitt/laughing-train/commit/5452a964d70bdcfdd80c1fae650d71c0787f87c4))
* **spoon:** Improve error logging to contain badsmell classname ([e2f53e5](https://github.com/MartinWitt/laughing-train/commit/e2f53e5ba268e1352184a5eb9343e76e9b89a09b))
* **spoon:** Improve error logging to contain badsmell classname ([#851](https://github.com/MartinWitt/laughing-train/issues/851)) ([a493511](https://github.com/MartinWitt/laughing-train/commit/a493511040631bc46a15e9da8a7154da6bf68094))
* **spoon:** Improve logging of spoon analyzer with too large stacktraces ([#865](https://github.com/MartinWitt/laughing-train/issues/865)) ([3b3b95a](https://github.com/MartinWitt/laughing-train/commit/3b3b95a5ba7dfd7822a08d6128945ee3cb44733f))
* **spoon:** Make conversion of spoon-analyzer more robust ([#849](https://github.com/MartinWitt/laughing-train/issues/849)) ([d45f858](https://github.com/MartinWitt/laughing-train/commit/d45f8580633ce65da1e48522df9f08ad24dd463e))
* **spoon:** Reduce logging noise for conversion ([#850](https://github.com/MartinWitt/laughing-train/issues/850)) ([0984601](https://github.com/MartinWitt/laughing-train/commit/09846016819aa9660416cf2f1fe7dbd7ce425e1d))


### Dependencies

* :bookmark:(deps): update actions/setup-java digest to cd89f46 ([#891](https://github.com/MartinWitt/laughing-train/issues/891)) ([cd8bbb4](https://github.com/MartinWitt/laughing-train/commit/cd8bbb4af6eb246b0ebe2cc523d5a5c0e9d8cd88))
* :bookmark:(deps): update github/codeql-action digest to 1813ca7 ([#873](https://github.com/MartinWitt/laughing-train/issues/873)) ([cfb72e3](https://github.com/MartinWitt/laughing-train/commit/cfb72e3dcbd944498785963f5d493a0699366e71))
* :bookmark:(deps): update github/codeql-action digest to 6ca1aa8 ([#900](https://github.com/MartinWitt/laughing-train/issues/900)) ([6b2497a](https://github.com/MartinWitt/laughing-train/commit/6b2497af876c48bb69c034479f963f290770aa6d))
* :bookmark:(deps): update google-github-actions/release-please-action digest to ca6063f ([#878](https://github.com/MartinWitt/laughing-train/issues/878)) ([8d0e9c1](https://github.com/MartinWitt/laughing-train/commit/8d0e9c1d31be89d5c1b9517f1972668adbae0bb1))
* :bookmark:(deps): update gradle/gradle-build-action digest to 915a66c ([#859](https://github.com/MartinWitt/laughing-train/issues/859)) ([d982f61](https://github.com/MartinWitt/laughing-train/commit/d982f616d7e6b239c237a58f86f6f541290a46ae))
* :bookmark:(deps): update gradle/gradle-build-action digest to a4cf152 ([#892](https://github.com/MartinWitt/laughing-train/issues/892)) ([276db32](https://github.com/MartinWitt/laughing-train/commit/276db328e2151f208868db691f11f86b00e2a674))
* :bookmark:(deps): update sigstore/cosign-installer digest to a5d81fb ([#877](https://github.com/MartinWitt/laughing-train/issues/877)) ([aa61ec9](https://github.com/MartinWitt/laughing-train/commit/aa61ec9a005d236d7387cc353485981edb5730eb))

## [1.2.0](https://github.com/MartinWitt/laughing-train/compare/v1.1.0...v1.2.0) (2023-07-15)


### Features

* Refactor spoon/qodana mining to event based strategy ([#829](https://github.com/MartinWitt/laughing-train/issues/829)) ([b776ccc](https://github.com/MartinWitt/laughing-train/commit/b776ccc59c0bc1687349f41cdc20d433961db699))
* **spoon:** Add spoon based analyzer ([#806](https://github.com/MartinWitt/laughing-train/issues/806)) ([24affc8](https://github.com/MartinWitt/laughing-train/commit/24affc8059ee972c072795c1d1eccc99646d6860))
* **spoon:** Seperated Qodana and Spoon mining ([#814](https://github.com/MartinWitt/laughing-train/issues/814)) ([3d352f1](https://github.com/MartinWitt/laughing-train/commit/3d352f1c1f67c967c4d596c6ca708469d190a3fa))
* **vertx:** Start mining directly after finishing it again ([#841](https://github.com/MartinWitt/laughing-train/issues/841)) ([072053f](https://github.com/MartinWitt/laughing-train/commit/072053f08eba16b651038a10de8cfbcf0275413e))
* **vertx:** Start mining earlier if current run finishes faster ([#838](https://github.com/MartinWitt/laughing-train/issues/838)) ([0722974](https://github.com/MartinWitt/laughing-train/commit/0722974358c7d6d5adffc863d4495798ddcd7ccf))
* **vertx:** Use more robust time constrained mining instead of result based ([#833](https://github.com/MartinWitt/laughing-train/issues/833)) ([8aeb521](https://github.com/MartinWitt/laughing-train/commit/8aeb521503d52ba95bebc20939b9c18680308c67))


### Bug Fixes

* **frontend:** Fix layout in frontend ([#818](https://github.com/MartinWitt/laughing-train/issues/818)) ([ec80525](https://github.com/MartinWitt/laughing-train/commit/ec80525b79d05685cf12b27f723d496afd918f97))
* **spoon:** Add logging to spoon analyzer ([#808](https://github.com/MartinWitt/laughing-train/issues/808)) ([f474284](https://github.com/MartinWitt/laughing-train/commit/f474284ab9a4f263e514333e20626b9f7c196864))
* **spoon:** Fix cleaning of repositories ([c9c9811](https://github.com/MartinWitt/laughing-train/commit/c9c9811b0cc0139093517208c9a6fc25e48098a4))
* **spoon:** Fix filtering of non source path for spoon analyzer ([#840](https://github.com/MartinWitt/laughing-train/issues/840)) ([5a5600d](https://github.com/MartinWitt/laughing-train/commit/5a5600d51e9dd44cc5e292775b994799fe3f6510))
* **spoon:** Fix NPE in ConstructorMatcher ([#813](https://github.com/MartinWitt/laughing-train/issues/813)) ([72e3525](https://github.com/MartinWitt/laughing-train/commit/72e35259e09ee9a9874ce65120893f15698f8efa))
* **spoon:** Improve logging for spoon based analyzer ([#809](https://github.com/MartinWitt/laughing-train/issues/809)) ([acaae6d](https://github.com/MartinWitt/laughing-train/commit/acaae6d436d8444c8832ab75ae16effef0a01c58))
* **spoon:** Mark class as non abstract ([#817](https://github.com/MartinWitt/laughing-train/issues/817)) ([35b988f](https://github.com/MartinWitt/laughing-train/commit/35b988f149ac57b1cb7fdef70308da24b49e773d))
* **spoon:** Mark SpoonMiner as @Unremovable ([#816](https://github.com/MartinWitt/laughing-train/issues/816)) ([7431304](https://github.com/MartinWitt/laughing-train/commit/7431304e95ee50acf7d188a3677f35f1fd3f2450))
* **spoon:** NPE in InvocationMatcher ([#830](https://github.com/MartinWitt/laughing-train/issues/830)) ([b333709](https://github.com/MartinWitt/laughing-train/commit/b333709016ed01c472b98ae4494b97e863674979))
* **spoon:** Reduce logging from spoon to error ([74d9afb](https://github.com/MartinWitt/laughing-train/commit/74d9afbf68442099a5fa5ab4d04dfc49678087c5))
* **vertx:** Add error logging to exceptions in vertx ([#819](https://github.com/MartinWitt/laughing-train/issues/819)) ([3b3f843](https://github.com/MartinWitt/laughing-train/commit/3b3f8434108f4246e04d1793e93a1e4fac305289))
* **vertx:** Fix blocking thread issues for vertx verticle ([#832](https://github.com/MartinWitt/laughing-train/issues/832)) ([77f22d8](https://github.com/MartinWitt/laughing-train/commit/77f22d8d2799693496b3b0aefa329d9d87b6f36f))
* **vertx:** Fix duplication of vertx events ([b247909](https://github.com/MartinWitt/laughing-train/commit/b24790952e59960bd0c5f7bb761c975d04c33c08))
* **vertx:** Fix event duplication during spoon mining ([27ab435](https://github.com/MartinWitt/laughing-train/commit/27ab4354bd6ddca2fc8fc8a65fd95ef431204133))
* **vertx:** Fix quarkus config, with spec conform config key ([4f7f147](https://github.com/MartinWitt/laughing-train/commit/4f7f147b1f85c1672494b6fa5638b9d942b21aa5))
* **vertx:** Fix vertx thread blocker warninings ([#831](https://github.com/MartinWitt/laughing-train/issues/831)) ([ba340a0](https://github.com/MartinWitt/laughing-train/commit/ba340a0098f09a21798690ba53e38e1a639a63e1))
* **vertx:** Fix wrong message for vertx eventbus ([#839](https://github.com/MartinWitt/laughing-train/issues/839)) ([5e9f3b3](https://github.com/MartinWitt/laughing-train/commit/5e9f3b30bfef9ab83b735281710149fed83f5f58))
* **vertx:** Increase timeout for git clone operation ([#834](https://github.com/MartinWitt/laughing-train/issues/834)) ([3eb5c6e](https://github.com/MartinWitt/laughing-train/commit/3eb5c6e04918c0711a26187fe9f786fb9ab43540))
* **vertx:** Run Spoon and Qodana mining in sync ([#822](https://github.com/MartinWitt/laughing-train/issues/822)) ([46529d2](https://github.com/MartinWitt/laughing-train/commit/46529d290c92eb19c7e2a57b0e3eeebc9814677e))
* **vertx:** Use a worker pool for mining ([#820](https://github.com/MartinWitt/laughing-train/issues/820)) ([1026247](https://github.com/MartinWitt/laughing-train/commit/1026247ddde37152937ff3332a85798d4169677c))
* **vertx:** Use publish instead of send ([7b89a83](https://github.com/MartinWitt/laughing-train/commit/7b89a83656fb97c6cc11ae37e410bbb700d7447d))
* **vertx:** Use reply instead of return ([#835](https://github.com/MartinWitt/laughing-train/issues/835)) ([297cf25](https://github.com/MartinWitt/laughing-train/commit/297cf25f7b4fd0a590bc3c1281bfb9fd10293666))
* **vertx:** Use timeunits for max blocking time ([#821](https://github.com/MartinWitt/laughing-train/issues/821)) ([26dcf19](https://github.com/MartinWitt/laughing-train/commit/26dcf19ba5eb1a04f7fa3e9f867748f961a21952))
* **vertx:** Wait with mining till all verticles are deployed ([#836](https://github.com/MartinWitt/laughing-train/issues/836)) ([1a4ba5b](https://github.com/MartinWitt/laughing-train/commit/1a4ba5bb9067227ae86f5c68450964bc7d1ac8ab))


### Dependencies

* :bookmark:(deps): update docker/build-push-action digest to 4fad532 ([#823](https://github.com/MartinWitt/laughing-train/issues/823)) ([8c0818a](https://github.com/MartinWitt/laughing-train/commit/8c0818a1a8b00a764b921ac09488d601b9986a19))
* :bookmark:(deps): update docker/login-action digest to a979406 ([#824](https://github.com/MartinWitt/laughing-train/issues/824)) ([c6feb9f](https://github.com/MartinWitt/laughing-train/commit/c6feb9fb98b71012dfc677bd24ba6eba0417a933))
* :bookmark:(deps): update docker/setup-buildx-action digest to 4c0219f ([#827](https://github.com/MartinWitt/laughing-train/issues/827)) ([75d79e6](https://github.com/MartinWitt/laughing-train/commit/75d79e647ea53570ac98bf5d842185e50308fbb1))
* :bookmark:(deps): update github/codeql-action digest to 489225d ([#837](https://github.com/MartinWitt/laughing-train/issues/837)) ([eef7a87](https://github.com/MartinWitt/laughing-train/commit/eef7a8735f3177480d1eea8c9f9f7aad939b05c4))
* :bookmark:(deps): update gradle/gradle-build-action digest to bd57605 ([#811](https://github.com/MartinWitt/laughing-train/issues/811)) ([828c21d](https://github.com/MartinWitt/laughing-train/commit/828c21dc8ca11c30fbcd9159cf53aa0491ae6577))

## [1.1.0](https://github.com/MartinWitt/laughing-train/compare/v1.0.0...v1.1.0) (2023-07-08)


### Features

* ✨ Add pattern based spoon analyzer ([#719](https://github.com/MartinWitt/laughing-train/issues/719)) ([66b9a08](https://github.com/MartinWitt/laughing-train/commit/66b9a08e33bbaa280a7017dff1fec1358332e959))
* ✨ Remove old analyzer ([19910fc](https://github.com/MartinWitt/laughing-train/commit/19910fc80eb5847427cd6293c2de97d9839b8d9d))
* ✨ Separated Qodana and Spoon mining ([#729](https://github.com/MartinWitt/laughing-train/issues/729)) ([dda44b2](https://github.com/MartinWitt/laughing-train/commit/dda44b233f64e6d50fe068cd52994515777e60aa))
* **matcher:** Add new matchers for spoon elements ([#804](https://github.com/MartinWitt/laughing-train/issues/804)) ([43a8483](https://github.com/MartinWitt/laughing-train/commit/43a84830b4f6b6f958e5bc13478f0f5daf95c6be))
* Merge persistence with github-bot ([#800](https://github.com/MartinWitt/laughing-train/issues/800)) ([b862681](https://github.com/MartinWitt/laughing-train/commit/b862681c12733fa86c8889e8cfc47b5ae6d5ab5c))
* **pattern:** ✨ Persist spoon pattern results and expose them in the API ([#725](https://github.com/MartinWitt/laughing-train/issues/725)) ([74feb39](https://github.com/MartinWitt/laughing-train/commit/74feb39cb06367eacd12152ddc16b9540e450a46))
* **qodana:** ✨ Dont remine old repositories again if hash is already analyzed ([0f602e9](https://github.com/MartinWitt/laughing-train/commit/0f602e96eb5cc91a055d1f7f9848fc32b6a85b7e))
* **quarkus:** ✨ Add logging UI ([#766](https://github.com/MartinWitt/laughing-train/issues/766)) ([5c5c541](https://github.com/MartinWitt/laughing-train/commit/5c5c541cf563da6c4a883fe2753c812319f565ff))


### Bug Fixes

* 🐛 Catch Exception during Pattern load ([#722](https://github.com/MartinWitt/laughing-train/issues/722)) ([ae517c0](https://github.com/MartinWitt/laughing-train/commit/ae517c0d78846e34ac76157d8bfc5c57dcfa32c9))
* 🚑️ Fix FileSystemnotFound for resource files ([#723](https://github.com/MartinWitt/laughing-train/issues/723)) ([d39076d](https://github.com/MartinWitt/laughing-train/commit/d39076de0042fe963707abca8fb472e2e880a144))
* 🚑️ Fix logging of errors ([a370d2b](https://github.com/MartinWitt/laughing-train/commit/a370d2bdc6135e81d784ed4d7d57a3233dbe5733))
* **git:** 🐛 Fix newlines after refactoring and cleaning diff ([#769](https://github.com/MartinWitt/laughing-train/issues/769)) ([c925285](https://github.com/MartinWitt/laughing-train/commit/c9252852a35d0a2ce1798c5e10b9409082de83c3))
* **git:** 🐛 Improve commit message for single badsmell PRs ([#767](https://github.com/MartinWitt/laughing-train/issues/767)) ([b11d8a8](https://github.com/MartinWitt/laughing-train/commit/b11d8a8c69efda974e0b22caf7e962ea4825c320))
* **printing:** 🐛 Fix extra newlines after printing ([#765](https://github.com/MartinWitt/laughing-train/issues/765)) ([89d75c0](https://github.com/MartinWitt/laughing-train/commit/89d75c039eacf333fc1c4c29493959cc6ba8068d))
* **printing:** 🐛 Simplifies handling of newlines in diff cleaned files ([#770](https://github.com/MartinWitt/laughing-train/issues/770)) ([2d17740](https://github.com/MartinWitt/laughing-train/commit/2d177404413c4ea17a05e287fe11efa094af7964))
* **quarkus:** 🐛 Remove opentelemetry ([50c7727](https://github.com/MartinWitt/laughing-train/commit/50c772741813f2aef0bb2238a30108e5b61f7d0a))
* **test:** 🚑️ Disable testcase again ([dc67fd7](https://github.com/MartinWitt/laughing-train/commit/dc67fd762421650bba19bd5483e7e56981c97a39))


### Dependencies

* :bookmark:(deps): update actions/checkout digest to c85c95e ([#718](https://github.com/MartinWitt/laughing-train/issues/718)) ([02bd8e2](https://github.com/MartinWitt/laughing-train/commit/02bd8e263362864b3206a120ce3ae8b95ac34cd5))
* :bookmark:(deps): update docker/build-push-action digest to 2eb1c19 ([#737](https://github.com/MartinWitt/laughing-train/issues/737)) ([7e9e1b9](https://github.com/MartinWitt/laughing-train/commit/7e9e1b93aa4f5609016370913f1d7153fa182bab))
* :bookmark:(deps): update docker/build-push-action digest to 44ea916 ([#711](https://github.com/MartinWitt/laughing-train/issues/711)) ([2d75e7d](https://github.com/MartinWitt/laughing-train/commit/2d75e7d41f7dda7479e1db0d44abdf4f8bc290a8))
* :bookmark:(deps): update docker/build-push-action digest to a799b4d ([#698](https://github.com/MartinWitt/laughing-train/issues/698)) ([5b5f697](https://github.com/MartinWitt/laughing-train/commit/5b5f697ca0430da997f16e409be1bc7856e0bdd0))
* :bookmark:(deps): update docker/build-push-action digest to f05b754 ([#788](https://github.com/MartinWitt/laughing-train/issues/788)) ([62b09eb](https://github.com/MartinWitt/laughing-train/commit/62b09eb6fe9c75827d0a9b005406a377ed9262b1))
* :bookmark:(deps): update docker/login-action digest to 0a5a6d5 ([#791](https://github.com/MartinWitt/laughing-train/issues/791)) ([68a4c99](https://github.com/MartinWitt/laughing-train/commit/68a4c991c448bde4d305bcb1b60c9366cba7e41a))
* :bookmark:(deps): update docker/login-action digest to 465a078 ([#707](https://github.com/MartinWitt/laughing-train/issues/707)) ([74aff2f](https://github.com/MartinWitt/laughing-train/commit/74aff2fc6c0daff1e8ebbc5d364e597210b1ca9a))
* :bookmark:(deps): update docker/metadata-action digest to 2c0bd77 ([#709](https://github.com/MartinWitt/laughing-train/issues/709)) ([ab27f08](https://github.com/MartinWitt/laughing-train/commit/ab27f08071ad3855958e878b495f56652c592e62))
* :bookmark:(deps): update docker/metadata-action digest to 35e9aff ([#792](https://github.com/MartinWitt/laughing-train/issues/792)) ([5ac884d](https://github.com/MartinWitt/laughing-train/commit/5ac884d89794c9cf9f6858eb32beb335a74d3e93))
* :bookmark:(deps): update docker/metadata-action digest to 818d4b7 ([#738](https://github.com/MartinWitt/laughing-train/issues/738)) ([1646bdf](https://github.com/MartinWitt/laughing-train/commit/1646bdf6a9d2f3154559147de531a18875d599de))
* :bookmark:(deps): update docker/metadata-action digest to ef25336 ([#772](https://github.com/MartinWitt/laughing-train/issues/772)) ([9390307](https://github.com/MartinWitt/laughing-train/commit/939030757d69a8d81de675f5d7974c756c657ae8))
* :bookmark:(deps): update docker/setup-buildx-action digest to 16c0bc4 ([#775](https://github.com/MartinWitt/laughing-train/issues/775)) ([76e27d1](https://github.com/MartinWitt/laughing-train/commit/76e27d12be09adcbd257e3759e697ca455b44b02))
* :bookmark:(deps): update docker/setup-buildx-action digest to 2a1a44a ([#794](https://github.com/MartinWitt/laughing-train/issues/794)) ([e7d33ac](https://github.com/MartinWitt/laughing-train/commit/e7d33ac4c644b45585aa443a69a9573c0256c4f0))
* :bookmark:(deps): update docker/setup-buildx-action digest to 2a81c53 ([#702](https://github.com/MartinWitt/laughing-train/issues/702)) ([b23c0bb](https://github.com/MartinWitt/laughing-train/commit/b23c0bb9f286387550ce4f9fa0491d1218dd7284))
* :bookmark:(deps): update docker/setup-buildx-action digest to 6a58db7 ([#710](https://github.com/MartinWitt/laughing-train/issues/710)) ([22258d9](https://github.com/MartinWitt/laughing-train/commit/22258d953a975cfce0bd2f075088f52b55aa1928))
* :bookmark:(deps): update docker/setup-buildx-action digest to bdd549b ([#726](https://github.com/MartinWitt/laughing-train/issues/726)) ([2d6af9a](https://github.com/MartinWitt/laughing-train/commit/2d6af9a4c2d0c75b15f0c4b0e71caf9d8a3f82fd))
* :bookmark:(deps): update docker/setup-buildx-action digest to ecf9528 ([#739](https://github.com/MartinWitt/laughing-train/issues/739)) ([ef4af75](https://github.com/MartinWitt/laughing-train/commit/ef4af75a5edd7625269f55a888eaebe6b775213e))
* :bookmark:(deps): update github/codeql-action digest to 004c5de ([#787](https://github.com/MartinWitt/laughing-train/issues/787)) ([a70f48f](https://github.com/MartinWitt/laughing-train/commit/a70f48faa772b665f32ef1197b7482e73f056a38))
* :bookmark:(deps): update github/codeql-action digest to 46ed16d ([#793](https://github.com/MartinWitt/laughing-train/issues/793)) ([7b26ae7](https://github.com/MartinWitt/laughing-train/commit/7b26ae78eb50df1cbc2b900e08374eaebf5252d3))
* :bookmark:(deps): update github/codeql-action digest to 6c089f5 ([#741](https://github.com/MartinWitt/laughing-train/issues/741)) ([51a224a](https://github.com/MartinWitt/laughing-train/commit/51a224a4e2adc8bb0ca6441621dc6e4e0e17972c))
* :bookmark:(deps): update github/codeql-action digest to f6e388e ([#752](https://github.com/MartinWitt/laughing-train/issues/752)) ([e4579e1](https://github.com/MartinWitt/laughing-train/commit/e4579e1767699ed523d58053d3f98cc52a0d5eda))
* :bookmark:(deps): update google-github-actions/release-please-action digest to 8016a66 ([#760](https://github.com/MartinWitt/laughing-train/issues/760)) ([b840b9e](https://github.com/MartinWitt/laughing-train/commit/b840b9e49fd3f018afa72be723f39a58629067f3))
* :bookmark:(deps): update gradle/gradle-build-action digest to 40b6781 ([#780](https://github.com/MartinWitt/laughing-train/issues/780)) ([3ddd630](https://github.com/MartinWitt/laughing-train/commit/3ddd6300fa68cd2783beaff1a2ea6d5464371500))
* :bookmark:(deps): update gradle/gradle-build-action digest to 8e02c82 ([#779](https://github.com/MartinWitt/laughing-train/issues/779)) ([eec02c0](https://github.com/MartinWitt/laughing-train/commit/eec02c0891035a371b74aff8c700194fead98514))
* :bookmark:(deps): update sigstore/cosign-installer digest to 6e04d22 ([#773](https://github.com/MartinWitt/laughing-train/issues/773)) ([49dac43](https://github.com/MartinWitt/laughing-train/commit/49dac434c71b0a8e67c3fbaa7f384def48cbac80))
* :bookmark:(deps): update sigstore/cosign-installer digest to 871cdc7 ([#701](https://github.com/MartinWitt/laughing-train/issues/701)) ([5b319a1](https://github.com/MartinWitt/laughing-train/commit/5b319a13a814b932bfa988454d47cf129e655d3a))
* :bookmark:(deps): update sigstore/cosign-installer digest to d130283 ([#763](https://github.com/MartinWitt/laughing-train/issues/763)) ([1c8735d](https://github.com/MartinWitt/laughing-train/commit/1c8735d9212539c1ffc3b94acd9a1544c8e19fdb))
* :bookmark:(deps): update sigstore/cosign-installer digest to ef0e969 ([#731](https://github.com/MartinWitt/laughing-train/issues/731)) ([2833bd7](https://github.com/MartinWitt/laughing-train/commit/2833bd744feb28ae3e784e235dd3f00737ce4f0f))

## 1.0.0 (2023-06-05)


### Features

* ✨ Add opentelemetry ([#635](https://github.com/MartinWitt/laughing-train/issues/635)) ([150ff41](https://github.com/MartinWitt/laughing-train/commit/150ff41c7ffc152616c587a188adec63411225dd))
* add 2 new qodana rules ([#255](https://github.com/MartinWitt/laughing-train/issues/255)) ([789796e](https://github.com/MartinWitt/laughing-train/commit/789796e49a96dec01886dcf03cec116b936e64ec))
* add inner_class_may_be_static rule ([#239](https://github.com/MartinWitt/laughing-train/issues/239)) ([7fa964f](https://github.com/MartinWitt/laughing-train/commit/7fa964ff89b8a44a708c7f63a40733bf9948a5d4))
* add projectconfig ([#228](https://github.com/MartinWitt/laughing-train/issues/228)) ([9d9c607](https://github.com/MartinWitt/laughing-train/commit/9d9c60782ba6c5eee4d33b90ceb3868648b0ce66))
* add UnnecessaryModifier rule ([#219](https://github.com/MartinWitt/laughing-train/issues/219)) ([165bbde](https://github.com/MartinWitt/laughing-train/commit/165bbde000bfc090db0d46cb6179c60527f5383d))
* fix ToArrayCallWithZeroLengthArrayArgument ([#241](https://github.com/MartinWitt/laughing-train/issues/241)) ([eb16bf4](https://github.com/MartinWitt/laughing-train/commit/eb16bf40ab34fb5447c4c8615c38346d1275c508))
* improve logging for refactoring ([#236](https://github.com/MartinWitt/laughing-train/issues/236)) ([7538085](https://github.com/MartinWitt/laughing-train/commit/75380857b4efd18c372e0ae10661b13c167755af))
* increase logging for refactorings ([86d5684](https://github.com/MartinWitt/laughing-train/commit/86d56840473d8e071530164bd4ae52598246283b))
* mine projects periodic random instead of full mining ([#235](https://github.com/MartinWitt/laughing-train/issues/235)) ([7e91c1e](https://github.com/MartinWitt/laughing-train/commit/7e91c1eda0bfcb20adad06d95fbf00ccb0e84fd5))
* use all java qodana rules ([#253](https://github.com/MartinWitt/laughing-train/issues/253)) ([7cb1abe](https://github.com/MartinWitt/laughing-train/commit/7cb1abeda320ddcb844938a441863c180b4605c2))
* use gitmoji ([#256](https://github.com/MartinWitt/laughing-train/issues/256)) ([68edec0](https://github.com/MartinWitt/laughing-train/commit/68edec0cece9b37cea524caf02a0613510529ef2))


### Bug Fixes

* 🐛 Fix extra newlines add file end ([#630](https://github.com/MartinWitt/laughing-train/issues/630)) ([e2a4a45](https://github.com/MartinWitt/laughing-train/commit/e2a4a45fef8e762da3d045589a54ef73ec740f84))
* 🐛 Fix UI thead blocking ([#628](https://github.com/MartinWitt/laughing-train/issues/628)) ([e2b448c](https://github.com/MartinWitt/laughing-train/commit/e2b448cf9474751331415350c193f7f07a39fc0f))
* 🐛 Split oicd cookies into 3 parts  ([#627](https://github.com/MartinWitt/laughing-train/issues/627)) ([e57ad0c](https://github.com/MartinWitt/laughing-train/commit/e57ad0cac514c89a1b44b902519cba3da1d6c4de))
* 🚑️ Add missing parameter to ctor ([#629](https://github.com/MartinWitt/laughing-train/issues/629)) ([cd69516](https://github.com/MartinWitt/laughing-train/commit/cd69516c5c84f456bb253e538c53da914a2b5dc6))
* check for modifier existence before refactoring ([#243](https://github.com/MartinWitt/laughing-train/issues/243)) ([d46079e](https://github.com/MartinWitt/laughing-train/commit/d46079ed4b75278795453130dea58bd93ab10aa0))
* **deps:** update dependency @apollo/client to v3.7.1 ([#229](https://github.com/MartinWitt/laughing-train/issues/229)) ([9953265](https://github.com/MartinWitt/laughing-train/commit/9953265709418a2926b69828ad1bc3023daeb5db))
* **deps:** update dependency @testing-library/react to v14 ([#468](https://github.com/MartinWitt/laughing-train/issues/468)) ([bfcf38b](https://github.com/MartinWitt/laughing-train/commit/bfcf38bb4d110e04d8d45ca00c5d6053d6cfe034))
* **deps:** update dependency @types/node to v18.11.5 ([#220](https://github.com/MartinWitt/laughing-train/issues/220)) ([2abc123](https://github.com/MartinWitt/laughing-train/commit/2abc1230336ae7da31b66664d3dd051f1ce1ce56))
* **deps:** update dependency @types/node to v18.11.6 ([#227](https://github.com/MartinWitt/laughing-train/issues/227)) ([d1a4d06](https://github.com/MartinWitt/laughing-train/commit/d1a4d06f1e6c822462dded95cdd6f6ac19c8eab3))
* **deps:** update dependency @types/node to v18.11.7 ([#231](https://github.com/MartinWitt/laughing-train/issues/231)) ([3d815ce](https://github.com/MartinWitt/laughing-train/commit/3d815ce3510474faaae3e91e6632b02ae4c21c6e))
* **deps:** update dependency @types/node to v18.11.8 ([#245](https://github.com/MartinWitt/laughing-train/issues/245)) ([59b631c](https://github.com/MartinWitt/laughing-train/commit/59b631c6680a60c41ac03fa29c15ba9bc21a4025))
* **deps:** update dependency @types/react to v18.0.22 ([#217](https://github.com/MartinWitt/laughing-train/issues/217)) ([c3fdd5d](https://github.com/MartinWitt/laughing-train/commit/c3fdd5d39b35a8d6ac9347f20127da0c123d6024))
* **deps:** update dependency @types/react to v18.0.23 ([#223](https://github.com/MartinWitt/laughing-train/issues/223)) ([d3e6972](https://github.com/MartinWitt/laughing-train/commit/d3e6972b687b16b58dc5cc93fcd30d10ec7afe14))
* **deps:** update dependency @types/react to v18.0.24 ([#233](https://github.com/MartinWitt/laughing-train/issues/233)) ([99e23b4](https://github.com/MartinWitt/laughing-train/commit/99e23b47950142e450c44bafb1f4a791bca5c53c))
* **deps:** update dependency @types/react-dom to v18.0.8 ([#234](https://github.com/MartinWitt/laughing-train/issues/234)) ([41899ae](https://github.com/MartinWitt/laughing-train/commit/41899ae8faeeae0c52423209726c849fa36b4b62))
* **deps:** update dependency io.quarkiverse.githubapi:quarkus-github-api to v1.313.1 ([#224](https://github.com/MartinWitt/laughing-train/issues/224)) ([0cadf62](https://github.com/MartinWitt/laughing-train/commit/0cadf6205da71e3074c810d8651685772b34f608))
* **deps:** update dependency io.quarkiverse.githubapp:quarkus-github-app to v1.15.1 ([#225](https://github.com/MartinWitt/laughing-train/issues/225)) ([e5220f4](https://github.com/MartinWitt/laughing-train/commit/e5220f45ebc6677df806e36b821a5a58c31f3ede))
* **deps:** update dependency io.quarkiverse.githubapp:quarkus-github-app-command-airline to v1.15.1 ([#226](https://github.com/MartinWitt/laughing-train/issues/226)) ([fd411d3](https://github.com/MartinWitt/laughing-train/commit/fd411d3fa282e7e31b367c3aab2654875f672e99))
* **deps:** update dependency io.quarkiverse.quinoa:quarkus-quinoa to v2 ([#522](https://github.com/MartinWitt/laughing-train/issues/522)) ([5b85c3d](https://github.com/MartinWitt/laughing-train/commit/5b85c3d38dfda58b0694e0935439757445d0a567))
* **deps:** update emotion monorepo to v11.10.5 ([#232](https://github.com/MartinWitt/laughing-train/issues/232)) ([67324fe](https://github.com/MartinWitt/laughing-train/commit/67324feeafb5fc1b50ab0720c86121ce871711d7))
* **deps:** update material-ui monorepo ([#221](https://github.com/MartinWitt/laughing-train/issues/221)) ([eb00c53](https://github.com/MartinWitt/laughing-train/commit/eb00c53feb749f460a666050df2846cef9f69c34))
* **deps:** update material-ui monorepo ([#254](https://github.com/MartinWitt/laughing-train/issues/254)) ([dc4c695](https://github.com/MartinWitt/laughing-train/commit/dc4c69539d8658138da6b077c97c72d50d888dfb))
* ignore duplicated classes ([#240](https://github.com/MartinWitt/laughing-train/issues/240)) ([4d96333](https://github.com/MartinWitt/laughing-train/commit/4d96333e518b4a95a253e90cb95c7b32ff26133e))
* improve periodic summary ([9fbfb15](https://github.com/MartinWitt/laughing-train/commit/9fbfb15f22802a9bc64e06d7e1ed997208240e2a))
* use extended modifiers ([#249](https://github.com/MartinWitt/laughing-train/issues/249)) ([5cb8278](https://github.com/MartinWitt/laughing-train/commit/5cb827895d3d3774fa9339787fc57626765825f0))
* use sourcefolder from config for refactorings ([#237](https://github.com/MartinWitt/laughing-train/issues/237)) ([6dc849e](https://github.com/MartinWitt/laughing-train/commit/6dc849ef4e2aa0c9cfc13bc69dbb781ef0e80c20))
* use startline only for matching ([#242](https://github.com/MartinWitt/laughing-train/issues/242)) ([4f1b492](https://github.com/MartinWitt/laughing-train/commit/4f1b4923d12e6c626440e291ee4e85e96d848462))


### Documentation

* **readme:** 📝 Update readme with newer information ([#654](https://github.com/MartinWitt/laughing-train/issues/654)) ([5303dce](https://github.com/MartinWitt/laughing-train/commit/5303dcef0682bdcf2252f2bc4ca30d7264d7e1e1))


### Dependencies

* :bookmark:(deps): update docker/build-push-action digest to f9efed5 ([#688](https://github.com/MartinWitt/laughing-train/issues/688)) ([65cbc29](https://github.com/MartinWitt/laughing-train/commit/65cbc2992bc40ee0d53b03fd89c3aeb2f93da13c))
* :bookmark:(deps): update docker/metadata-action digest to dbbf018 ([#695](https://github.com/MartinWitt/laughing-train/issues/695)) ([44d929a](https://github.com/MartinWitt/laughing-train/commit/44d929a2f86a02a9336b97395807d727b3a33184))
* :bookmark:(deps): update docker/setup-buildx-action digest to 95cefc3 ([#696](https://github.com/MartinWitt/laughing-train/issues/696)) ([fdc9383](https://github.com/MartinWitt/laughing-train/commit/fdc9383d25efcb46e4be04f42a1b6647fc5e8045))
* :bookmark:(deps): update github/codeql-action digest to 0225834 ([#677](https://github.com/MartinWitt/laughing-train/issues/677)) ([4f12302](https://github.com/MartinWitt/laughing-train/commit/4f12302cf900f3b8f75e6a03c4495951f73c5a1e))
* :bookmark:(deps): update github/codeql-action digest to 83f0fe6 ([#693](https://github.com/MartinWitt/laughing-train/issues/693)) ([593a4c1](https://github.com/MartinWitt/laughing-train/commit/593a4c1a7c03d1b356fa6555b39b170f5181b30e))
* :bookmark:(deps): update github/codeql-action digest to f0e3dfb ([#675](https://github.com/MartinWitt/laughing-train/issues/675)) ([5bb072c](https://github.com/MartinWitt/laughing-train/commit/5bb072c5290c76b88718b71f6e40aa564081941f))
* :bookmark:(deps): update sigstore/cosign-installer digest to 03d0fec ([#649](https://github.com/MartinWitt/laughing-train/issues/649)) ([55f39f7](https://github.com/MartinWitt/laughing-train/commit/55f39f75163c1e8c6becb0b5c1a671b221effcb3))
* :bookmark:(deps): update sigstore/cosign-installer digest to 1a22e17 ([#668](https://github.com/MartinWitt/laughing-train/issues/668)) ([a22fa1c](https://github.com/MartinWitt/laughing-train/commit/a22fa1ce33e23bc49fa011400bae1575b04b6d44))
* :bookmark:(deps): update sigstore/cosign-installer digest to 1b9f7b6 ([#697](https://github.com/MartinWitt/laughing-train/issues/697)) ([f9759b4](https://github.com/MartinWitt/laughing-train/commit/f9759b4ed46e2cae9efe7907b78c1f942a5441b1))
* :bookmark:(deps): update sigstore/cosign-installer digest to 8e47e41 ([#662](https://github.com/MartinWitt/laughing-train/issues/662)) ([aa60c8c](https://github.com/MartinWitt/laughing-train/commit/aa60c8cb992c2d4ab0bc53cf334a79b5a6f09371))
* :bookmark:(deps): update sigstore/cosign-installer digest to dd6b2e2 ([#665](https://github.com/MartinWitt/laughing-train/issues/665)) ([a58d61d](https://github.com/MartinWitt/laughing-train/commit/a58d61d66225fb8d6fa19f9d1f07279d65b5a2fb))
