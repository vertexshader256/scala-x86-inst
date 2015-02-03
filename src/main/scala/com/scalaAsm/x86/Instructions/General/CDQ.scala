package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Doubleword to Quadword
// Category: general/conver

object CDQ extends InstructionDefinition("CDQ") with CDQImpl

trait CDQImpl {
  implicit object CDQ_0 extends CDQ._0 {
    val opcode: OneOpcode = 0x99
    override def hasImplicitOperand = true
  }
}
