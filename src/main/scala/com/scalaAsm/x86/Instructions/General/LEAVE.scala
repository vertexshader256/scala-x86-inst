package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: High Level Procedure Exit
// Category: general/stack

object LEAVE extends InstructionDefinition("LEAVE") with LEAVEImpl

trait LEAVEImpl {
  implicit object LEAVE_0 extends LEAVE._0 {
    val opcode: OneOpcode = 0xC9
    override def hasImplicitOperand = true
  }
}
