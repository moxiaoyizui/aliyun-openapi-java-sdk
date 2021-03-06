/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.SearchWaterMarkTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchWaterMarkTemplateResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<WaterMarkTemplate> waterMarkTemplateList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<WaterMarkTemplate> getWaterMarkTemplateList() {
		return this.waterMarkTemplateList;
	}

	public void setWaterMarkTemplateList(List<WaterMarkTemplate> waterMarkTemplateList) {
		this.waterMarkTemplateList = waterMarkTemplateList;
	}

	public static class WaterMarkTemplate {

		private String id;

		private String name;

		private String width;

		private String height;

		private String dx;

		private String dy;

		private String referPos;

		private String type;

		private String state;

		private Timeline timeline;

		private RatioRefer ratioRefer;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getDx() {
			return this.dx;
		}

		public void setDx(String dx) {
			this.dx = dx;
		}

		public String getDy() {
			return this.dy;
		}

		public void setDy(String dy) {
			this.dy = dy;
		}

		public String getReferPos() {
			return this.referPos;
		}

		public void setReferPos(String referPos) {
			this.referPos = referPos;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Timeline getTimeline() {
			return this.timeline;
		}

		public void setTimeline(Timeline timeline) {
			this.timeline = timeline;
		}

		public RatioRefer getRatioRefer() {
			return this.ratioRefer;
		}

		public void setRatioRefer(RatioRefer ratioRefer) {
			this.ratioRefer = ratioRefer;
		}

		public static class Timeline {

			private String start;

			private String duration;

			public String getStart() {
				return this.start;
			}

			public void setStart(String start) {
				this.start = start;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}
		}

		public static class RatioRefer {

			private String dx;

			private String dy;

			private String width;

			private String height;

			public String getDx() {
				return this.dx;
			}

			public void setDx(String dx) {
				this.dx = dx;
			}

			public String getDy() {
				return this.dy;
			}

			public void setDy(String dy) {
				this.dy = dy;
			}

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}
		}
	}

	@Override
	public SearchWaterMarkTemplateResponse getInstance(UnmarshallerContext context) {
		return	SearchWaterMarkTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
